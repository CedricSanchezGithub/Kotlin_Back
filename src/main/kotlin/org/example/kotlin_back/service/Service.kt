package org.example.kotlin_back.service

import org.example.kotlin_back.repository.AnimalRepository
import org.springframework.stereotype.Service

@Service
class AnimalService(val animalRepository: AnimalRepository) {



}