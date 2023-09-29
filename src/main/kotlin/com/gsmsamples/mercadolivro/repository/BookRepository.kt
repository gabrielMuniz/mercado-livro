package com.gsmsamples.mercadolivro.repository

import com.gsmsamples.mercadolivro.model.Book
import com.gsmsamples.mercadolivro.model.Customer
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<Book, Int> {
    fun findByCustomer(customer: Customer): List<Book>
}