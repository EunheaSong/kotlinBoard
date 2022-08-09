package com.example.kotlinboard.entity

import javax.persistence.*

@Entity
class User(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long,

    @Column(nullable = false)
    var userEmail: String,

    @Column(nullable = false)
    val username: String,

    @Column(nullable = false)
    val password: String,

    @Column
    val userImage: String,

    @OneToMany(mappedBy = "user")
    val petList: List<Pet>,

    @Column
    var isDeleted : Boolean
) : Timestamped() {
}

