package com.practice.jpa.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EntityListeners
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import org.jetbrains.annotations.NotNull
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@Entity
@Table(name = "employees")
@EntityListeners(AuditingEntityListener::class)
data class Employee(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,

    @NotNull
    private val name: String,

    @NotNull
    @ManyToOne
    @JoinColumn(name = "department_id")
    private val department: Department,

    @Column(name = "created_date", nullable = false, updatable = false)
    @CreatedDate
    private val createdAt: LocalDateTime,

    @Column(name = "modified_date")
    @LastModifiedDate
    private val modifiedDate: LocalDateTime,

    @Column(name = "created_by")
    @CreatedBy
    private val createdBy: String,

    @Column(name = "last_modified_by")
    @LastModifiedBy
    private val lastModifiedBy: String,
)