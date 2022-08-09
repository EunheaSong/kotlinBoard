package com.example.kotlinboard.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

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

) : Timestamped(){
}