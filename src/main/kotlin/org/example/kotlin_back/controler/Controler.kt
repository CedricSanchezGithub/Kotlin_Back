package org.example.kotlin_back.controler

import org.example.kotlin_back.entity.NetflixEntity
import org.example.kotlin_back.service.NetflixService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/netflix")
class AnimalController(val netflixService: NetflixService) {

    @GetMapping("/getmovies")
    fun getAllMoviesDatas(): List<NetflixEntity> {
        println("récupération des données")
        return netflixService.readAllMovies()
    }

}