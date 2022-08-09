package com.example.kotlinboard.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Comments(
    @Id
    val id : Long,
    @Column
    var contents : String,

) : Timestamped() {
}