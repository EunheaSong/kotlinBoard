package com.example.kotlinboard.repository

import com.example.kotlinboard.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long> {
}