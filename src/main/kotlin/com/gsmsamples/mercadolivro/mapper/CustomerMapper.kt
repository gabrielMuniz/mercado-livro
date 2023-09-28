package com.gsmsamples.mercadolivro.mapper

import com.gsmsamples.mercadolivro.controller.request.AddCustomerRequest
import com.gsmsamples.mercadolivro.controller.request.UpdateCustomerRequest
import com.gsmsamples.mercadolivro.model.Customer

fun AddCustomerRequest.toModel() = Customer(name = name, email = email)

fun UpdateCustomerRequest.toModel(id: Int) = Customer(id = id, email = email, name = name)