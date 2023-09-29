package com.gsmsamples.mercadolivro.controller

import com.gsmsamples.mercadolivro.controller.request.customer.AddCustomerRequest
import com.gsmsamples.mercadolivro.controller.request.customer.UpdateCustomerRequest
import com.gsmsamples.mercadolivro.mapper.toModel
import com.gsmsamples.mercadolivro.service.BookService
import com.gsmsamples.mercadolivro.service.CustomerService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("customer")
@Tag(name = "Customer", description = "API de Customer")
class CustomerController(val customerService: CustomerService, val bookService: BookService) {

    @GetMapping
    fun getByName(@RequestParam(name = "name") name: String) = customerService.getByName(name)

    @GetMapping("/{id}")
    @Operation(summary = "Get Customer By Id", description = "Obter um customer por id")
    fun getById(@PathVariable id: Int) = customerService.getById(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun add(@RequestBody customerRequest: AddCustomerRequest) {
        customerService.add(customerRequest.toModel())
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: Int, @RequestBody customer: UpdateCustomerRequest) {
        customerService.update(customer = customer.toModel(id))
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int) {
        customerService.delete(id)
    }

}