package org.example.kotlinplayground

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/people")
class PersonController(
    private val personService: PersonService
) {

    @PostMapping
    fun createPerson(@RequestBody request: CreatePersonRequest) : Person {
        return personService.savePerson(request.name, request.age)
    }

    @GetMapping
    fun getPeople():List<Person> {
        return personService.getAllPeople()
    }
}