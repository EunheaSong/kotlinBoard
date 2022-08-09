package com.example.kotlinboard.entity

import javax.persistence.*

@Entity
class Pet(
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    val id: Long,

    @Column(nullable = false)
    val petName: String,

    @Column(nullable = false)
    val age: Int,

    @Column(nullable = false)
    val type: String, //강아지 , 고양이, 고슴도치, 햄스터, 기니피그,

    @Column(nullable = false)
    val petImage: String,

    @Column(nullable = false)
    val userId: Long

) {
}