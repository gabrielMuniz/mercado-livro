package com.gsmsamples.mercadolivro

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@OpenAPIDefinition
class MercadoLivroApplication

fun main(args: Array<String>) {
    runApplication<MercadoLivroApplication>(*args)
}
