package com.gsmsamples.mercadolivro.model

import com.gsmsamples.mercadolivro.model.enums.BookStatus
import jakarta.persistence.*
import java.math.BigDecimal

@Entity
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column
    var name: String,

    @Column
    val price: BigDecimal,

    @Column
    @Enumerated(EnumType.STRING)
    val status: BookStatus,

    @ManyToOne
    @JoinColumn(name="customer_id")
    val customer: Customer? = null
)
