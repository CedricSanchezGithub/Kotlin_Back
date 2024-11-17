package org.example.kotlin_back.controler
import org.example.kotlin_back.entity.OpenFoodFactsEntity
import org.example.kotlin_back.service.OpenFoodFactsService
import org.springframework.web.bind.annotation.*

// http://localhost:8081/openFoodFacts/getfoods

@RestController
@RequestMapping("/openFoodFacts")
class OpenFoodFactsController(val openFoodFactsService: OpenFoodFactsService) {

    @GetMapping("/getfoods")
    fun getAllFoodsDatas(): List<OpenFoodFactsEntity> {
        println("Lancement de la fonction getFoods")
        return openFoodFactsService.readAllFoods()
    }

    @PostMapping("/postfoods")
    fun postFoods(@RequestBody listOpenFoodFactsEntity: List<OpenFoodFactsEntity>) {
        println("Lancement de la fonction postFoods")
        return openFoodFactsService.postAllFoods(listOpenFoodFactsEntity)
    }
}
