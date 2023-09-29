package com.gsmsamples.mercadolivro.service

import com.gsmsamples.mercadolivro.model.Book
import com.gsmsamples.mercadolivro.model.Customer
import com.gsmsamples.mercadolivro.model.enums.BookStatus
import com.gsmsamples.mercadolivro.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(private val repository: BookRepository) {

    fun create(book: Book) {
        repository.save(book)
    }

    fun deleteByCustomer(customer: Customer) {
        val books = repository.findByCustomer(customer)

        val booksToDelete = books.map {
            it.copy(status = BookStatus.Deleted)
        }

        repository.saveAll(booksToDelete)
    }

}
