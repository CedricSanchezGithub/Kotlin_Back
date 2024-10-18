package org.example.kotlin_back.entity

import jakarta.persistence.*


@Entity
@Table(name = "netflix")
data class NetflixEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var movie: String? = "rien",

    @Column(name = "espece", nullable = false)
    var country: String? = "rien",

)