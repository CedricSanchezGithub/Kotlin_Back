package org.example.kotlin_back.entity

import jakarta.persistence.*


@Entity
@Table(name = "animaux")
data class AnimalEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = 0,

    @Column(nullable = false)
    var nom: String? = "rien",

    @Column(name = "espece", nullable = false)
    var espece: String? = "rien",

    @Column(name = "classe", nullable = false)
    var classe: String? = "rien"
)