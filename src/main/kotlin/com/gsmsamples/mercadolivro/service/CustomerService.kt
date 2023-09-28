package com.gsmsamples.mercadolivro.service

import com.gsmsamples.mercadolivro.model.Customer
import com.gsmsamples.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(val repository: CustomerRepository) {

    fun add(customer: Customer) {
        repository.save(customer)
    }

    fun delete(id: Int) {
        if (!repository.existsById(id)) {
            throw Exception()
        }

        repository.deleteById(id)
    }

    fun getById(id: Int) = repository.findById(id).orElseThrow()

    fun getAll() = repository.findAll()

    fun update(customer: Customer) {
        if (!repository.existsById(customer.id!!)) {
            throw Exception()
        }

        repository.save(customer)
    }

    fun getByName(name: String) = repository.findByNameContaining(name)

}