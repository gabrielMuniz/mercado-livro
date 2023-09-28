package com.gsmsamples.mercadolivro.repository

import com.gsmsamples.mercadolivro.model.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Int> {

    fun findByNameContaining(name: String): List<Customer>

}