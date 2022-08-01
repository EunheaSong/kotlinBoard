package com.example.kotlinboard.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Pet(
    @Id
    val id: Int,
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