package com.example.kotlinboard.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PetController() {

    @PostMapping("/pet/join")
    fun petJoin(){
        //반려동물 등록
    }

    @GetMapping("/pet/profile")
    fun getPetProfile(){
        //반려동물 조회
    }
}