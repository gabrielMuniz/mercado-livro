package com.gsmsamples.mercadolivro.mapper

import com.gsmsamples.mercadolivro.controller.request.customer.AddCustomerRequest
import com.gsmsamples.mercadolivro.controller.request.customer.UpdateCustomerRequest
import com.gsmsamples.mercadolivro.model.Customer
import com.gsmsamples.mercadolivro.model.enums.CustomerStatus

fun AddCustomerRequest.toModel() = Customer(name = name, email = email, status = CustomerStatus.Active)

fun UpdateCustomerRequest.toModel(id: Int) =
    Customer(id = id, email = email, name = name, status = CustomerStatus.Active)