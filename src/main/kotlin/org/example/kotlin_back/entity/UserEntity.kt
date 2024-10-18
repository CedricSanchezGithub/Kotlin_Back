package org.example.kotlin_back.entity

import jakarta.persistence.*


@Entity
@Table(name = "movies")
data class NetflixEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = 0,

    @Column
    var movieName: String? = "rien",

    @Column(name = "espece", nullable = false)
    var country: String? = "rien",

)