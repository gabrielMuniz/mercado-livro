package com.gsmsamples.mercadolivro.controller

import com.gsmsamples.mercadolivro.controller.request.book.AddBookRequest
import com.gsmsamples.mercadolivro.mapper.toBookModel
import com.gsmsamples.mercadolivro.service.BookService
import com.gsmsamples.mercadolivro.service.CustomerService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("book")
@Tag(name = "Book", description = "API de Book")
class BookController(val customerService: CustomerService, val service: BookService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody request: AddBookRequest) {
        val customer = customerService.getById(request.customerId)

        service.create(request.toBookModel(customer))
    }

}