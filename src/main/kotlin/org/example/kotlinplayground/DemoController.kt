package org.example.kotlinplayground

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class DemoController {

    @GetMapping
    fun sayHello(): String {
        return "코틀린 한잔 하실례에?"
    }


}