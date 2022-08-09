package com.example.kotlinboard.entity

import javax.persistence.*

@Entity
class Post(

    @Id
    val id : Long,

    @Column
    var title : String,

    @Column
    var contents : String,

    @Column
    var image : String,

    @Column
    val userId: Long,

    @JoinColumn
    @OneToMany(fetch = FetchType.LAZY)
    val comments: List <Comments>

) : Timestamped(){
}