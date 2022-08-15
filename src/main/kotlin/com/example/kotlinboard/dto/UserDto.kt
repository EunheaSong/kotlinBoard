package com.example.kotlinboard.dto

import javax.persistence.Column

class UserDto {

    class UserRequest(
        var userEmail: String,
        val username: String,
        val password: String
    ) {
    }

    class UserResponse {

    }
}

