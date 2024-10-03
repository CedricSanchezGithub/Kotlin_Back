package org.example.kotlin_back.controler

import org.example.kotlin_back.service.AnimalService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/animaux")
class AnimalController(val animalService: AnimalService) {



}