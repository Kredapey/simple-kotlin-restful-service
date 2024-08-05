package com.example.demo.model

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*

@Entity
@Table(name = "products")
data class Product (
    @Id
    @JsonProperty("id")
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0L,

    @JsonProperty("name")
    @Column(name = "name", length = 200)
    val name: String = "",

    @JsonProperty("description")
    @Column(name = "description")
    val description: String = ""
)