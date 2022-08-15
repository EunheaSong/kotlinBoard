package com.example.kotlinboard.entity

import javax.persistence.*

@Entity
class User(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long,

    @Column(nullable = false, unique = true)
    var userEmail: String,

    @Column(nullable = false, unique = true)
    val username: String,

    @Column(nullable = false)
    val password: String,

    @Column
    val userImage: String,

    @JoinColumn(name = "pet_id")
    @OneToMany(fetch = FetchType.LAZY)
    val petList: List<Pet>,

    @JoinColumn(name = "post_id")
    @OneToMany(fetch = FetchType.LAZY)
    val postList: List<Post>,

    @JoinColumn(name = "comment_id")
    @OneToMany(fetch = FetchType.LAZY)
    val commentList: List<Comments>,

    @Column(nullable = false, columnDefinition = "false")
    var isDeleted : Boolean
) : Timestamped() {
}

