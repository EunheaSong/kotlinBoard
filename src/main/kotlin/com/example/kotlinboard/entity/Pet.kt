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
    val type: String,

    @Column(nullable = false)
    val petImage: String,

    @Column(nullable = false)
    @ManyToOne
    var user: User
) {
}