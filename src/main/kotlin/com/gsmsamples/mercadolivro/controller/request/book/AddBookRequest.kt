package com.gsmsamples.mercadolivro.controller.request.book

import com.fasterxml.jackson.annotation.JsonAlias
import java.math.BigDecimal

data class AddBookRequest(
    val name: String,

    val price: BigDecimal,

    @JsonAlias("customer_id")
    val customerId: Int
)