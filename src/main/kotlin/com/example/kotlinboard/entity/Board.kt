package com.example.kotlinboard.entity

import javax.persistence.*

@Entity
class Board(
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    val id : Int,

    @Column
    val title : String,

    @JoinColumn(name = "post_id")
    @OneToMany(fetch = FetchType.LAZY)
    val postList : List<Post>

) : Timestamped() {
}