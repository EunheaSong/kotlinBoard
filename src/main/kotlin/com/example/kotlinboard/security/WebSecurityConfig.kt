package com.example.kotlinboard.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class WebSecurityConfig {

    @Bean
    fun encodePassword(): BCryptPasswordEncoder? {
        return BCryptPasswordEncoder()
    } //스프링 시큐리티에서 권고하는 BCrypt 해시 함수를 사용해서 비밀번호를 받도록 한다.

    @Bean
    @Throws(Exception::class)
    fun filterChain(http: HttpSecurity) : SecurityFilterChain? {
        http.csrf().disable()
            .headers()
            .frameOptions().sameOrigin()
        // 서버에서 인증은 JWT로 인증하기 때문에 Session의 생성을 막습니다.

        http
            .cors().and()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)

        http.authorizeRequests()
            .anyRequest()
            .permitAll()
            .and() // [로그아웃 기능]
            .logout() // 로그아웃 요청 처리 URL
            .logoutUrl("/user/logout") //todo : addLogoutHandler-> 로그아웃 이후 일어날 로직을 입력.
            // CustomLogoutHandler -> LogoutHandler를 구현. 리프레시 토큰을 삭제해주는 로그아웃 핸들러 추가.
            //                .addLogoutHandler(new CustomLogoutHandler())
            .permitAll()
            .and()
            .exceptionHandling() // "접근 불가" 페이지 URL 설정
            .accessDeniedPage("/forbidden.html")

        return http.build()
    }




}