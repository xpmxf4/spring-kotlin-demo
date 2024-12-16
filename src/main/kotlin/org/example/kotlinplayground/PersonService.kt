package org.example.kotlinplayground

import org.springframework.stereotype.Service

@Service
class PersonService(
    private val personRepository: PersonRepository
) {
    fun savePerson(name : String, age: Int):Person {
        val person = Person(name = name, age = age)
        return personRepository.save(person)
    }

    fun getAllPeople(): List<Person> {
        return personRepository.findAll()
    }
}