package com.example.kotlinboard.entity

import lombok.Getter
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@Getter // 변수가 전부 piravte 임으로 GET이 필요하다.
@MappedSuperclass // 상속했을 때, 컬럼으로 인식하게 합니다.컬럼=열
@EntityListeners(value = [AuditingEntityListener::class]) // 생성/수정 시간을 자동으로 반영하도록 설정
abstract class Timestamped {
    @CreatedBy
    @Column(name = "created_by", length = 15)
    var createBy: String? = null

    @CreatedDate
    @Column(name = "created_at" , nullable = false, updatable = false,  columnDefinition = "DATE")
    var createdAt: LocalDateTime? = null

    @LastModifiedDate
    @Column(name = "updated_at", columnDefinition = "DATE")
    var updatedAt  : LocalDateTime = LocalDateTime.now()

    @LastModifiedBy
    @Column(name = "updated_by", length = 15)
    var updateBy: String? = null
}