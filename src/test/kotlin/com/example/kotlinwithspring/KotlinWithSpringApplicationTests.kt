package com.example.kotlinwithspring

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KotlinWithSpringApplicationTests {

    @Test
    fun contextLoads() {
        println(listOf('a', 'b', 'c').joinToString(
            separator = "", prefix = "(", postfix = ")"))
    }

}