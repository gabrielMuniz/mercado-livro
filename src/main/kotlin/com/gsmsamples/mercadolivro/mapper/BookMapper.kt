package com.gsmsamples.mercadolivro.mapper

import com.gsmsamples.mercadolivro.controller.request.book.AddBookRequest
import com.gsmsamples.mercadolivro.model.Book
import com.gsmsamples.mercadolivro.model.Customer
import com.gsmsamples.mercadolivro.model.enums.BookStatus

fun AddBookRequest.toBookModel(customer: Customer) =
    Book(name = name, price = price, status = BookStatus.Active, customer = customer)