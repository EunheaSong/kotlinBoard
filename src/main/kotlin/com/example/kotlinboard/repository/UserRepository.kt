package com.example.kotlinboard.repository

import com.example.kotlinboard.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Int> {
}