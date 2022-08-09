package com.example.kotlinboard.repository

import com.example.kotlinboard.entity.Comments
import org.springframework.data.jpa.repository.JpaRepository

interface CommentsRepository : JpaRepository<Comments, Long> {
}