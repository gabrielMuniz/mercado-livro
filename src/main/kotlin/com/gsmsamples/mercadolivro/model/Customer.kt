package com.gsmsamples.mercadolivro.model

import com.gsmsamples.mercadolivro.model.enums.CustomerStatus
import jakarta.persistence.*

@Entity(name = "customer")
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    @Column
    val email: String,
    @Column
    val name: String,
    @Column
    @Enumerated(EnumType.STRING)
    val status: CustomerStatus
)
