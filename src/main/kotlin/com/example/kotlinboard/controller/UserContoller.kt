package com.example.kotlinboard.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserContoller() {

    @PostMapping("/")
    fun userJoin(){
        //회원가입
    }

    @PostMapping("/user/login")
    fun userLogin(){

    }

    @PostMapping("/user/logout")
    fun userLogout(){

    }

    @GetMapping("/user/profile")
    fun getUserProfile(){
        //사용자 프로필 조회
    }


    @DeleteMapping("/user/remove")
    fun removeUser(){

    }

}