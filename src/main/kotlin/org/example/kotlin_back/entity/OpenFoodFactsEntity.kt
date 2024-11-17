package org.example.kotlin_back.entity

import jakarta.persistence.*

@Entity
@Table(name = "food_facts_entity")
data class OpenFoodFactsEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(name = "product_name", nullable = false)
    var productName: String? = "aucune donnée pour product_name",

    @Column(name = "categories", nullable = true)
    var categories: String? = null,

    @Column(name = "ingredients_text", nullable = true)
    var ingredientsText: String? = null,

    @Column(name = "allergens", nullable = true)
    var allergens: String? = null,

    @Column(name = "traces", nullable = true)
    var traces: String? = null,

    @Column(name = "quantity", nullable = true)
    var quantity: String? = null,

    @Column(name = "serving_size", nullable = true)
    var servingSize: String? = null,

    @Column(name = "serving_quantity", nullable = true)
    var servingQuantity: Double? = null,

    @Column(name = "nutriscore_score", nullable = true)
    var nutriscoreScore: Int? = null,

    @Column(name = "nutriscore_grade", nullable = true)
    var nutriscoreGrade: String? = null,

    @Column(name = "nova_group", nullable = true)
    var novaGroup: Int? = null,

    @Column(name = "ecoscore_score", nullable = true)
    var ecoscoreScore: Double? = null,

    @Column(name = "ecoscore_grade", nullable = true)
    var ecoscoreGrade: String? = null,

    @Column(name = "energy_kj_100g", nullable = true)
    var energyKj100g: Double? = null,

    @Column(name = "energy_kcal_100g", nullable = true)
    var energyKcal100g: Double? = null,

    @Column(name = "sugars_100g", nullable = true)
    var sugars100g: Double? = null,

    @Column(name = "fiber_100g", nullable = true)
    var fiber100g: Double? = null,

    @Column(name = "proteins_100g", nullable = true)
    var proteins100g: Double? = null,

    @Column(name = "salt_100g", nullable = true)
    var salt100g: Double? = null,

    @Column(name = "fat_100g", nullable = true)
    var fat100g: Double? = null,

    @Column(name = "saturated_fat_100g", nullable = true)
    var saturatedFat100g: Double? = null
)
