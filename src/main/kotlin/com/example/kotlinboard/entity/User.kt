package com.example.kotlinboard.entity

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class User(
    @Id
    val id : Int,
    @Column(nullable = false)
    var userEmail : String,
    @Column(nullable = false)
    val username: String,
    @Column(nullable = false)
    val password: String,
    @Column
    val userImage:String,
    @Column
    @OneToMany(mappedBy = "user")
    val petList: List<Pet>,
    @Column
    var createAt: LocalDateTime,
    @Column
    val updateAt: LocalDateTime
) {
}