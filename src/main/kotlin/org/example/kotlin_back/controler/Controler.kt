package org.example.kotlin_back.controler

import org.example.kotlin_back.service.NetflixService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/netflix")
class AnimalController(val netflixService: NetflixService) {



}