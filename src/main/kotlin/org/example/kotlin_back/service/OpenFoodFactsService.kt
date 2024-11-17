package org.example.kotlin_back.service

import org.example.kotlin_back.entity.OpenFoodFactsEntity
import org.example.kotlin_back.repository.OpenFoodFactsRepository
import org.springframework.stereotype.Service

@Service
class OpenFoodFactsService(
    val openFoodFactsRepository: OpenFoodFactsRepository
) {

    fun readAllFoods(): List<OpenFoodFactsEntity> {
        return openFoodFactsRepository.findAll()
    }

    fun postAllFoods(food: List<OpenFoodFactsEntity>) {
        openFoodFactsRepository.saveAll(food)
    }

}
