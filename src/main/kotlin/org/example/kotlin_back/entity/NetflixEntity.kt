package org.example.kotlin_back.entity

import jakarta.persistence.*


@Entity
@Table(name = "netflix")
data class NetflixEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(name = "movie", nullable = false)
    var movie: String? = "aucune donnée pour movie",

    @Column(name = "country", nullable = false)
    var country: String? = "aucune donnée pour country",

)