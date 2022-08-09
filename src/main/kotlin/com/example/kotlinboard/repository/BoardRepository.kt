package com.example.kotlinboard.repository

import com.example.kotlinboard.entity.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository : JpaRepository<Board, Int> {
}