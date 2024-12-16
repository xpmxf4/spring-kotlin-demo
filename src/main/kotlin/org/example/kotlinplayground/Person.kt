package org.example.kotlinplayground

import jakarta.persistence.*

@Entity
@Table(name = "Person")
class Person (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val name: String,

    val age: Int
)