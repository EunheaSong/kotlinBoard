package com.example.kotlinboard.repository

import com.example.kotlinboard.entity.Pet
import org.springframework.data.jpa.repository.JpaRepository

interface PetRepository: JpaRepository<Pet, Int> {
}