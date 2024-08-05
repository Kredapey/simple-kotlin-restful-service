package com.example.demo.controller

import com.example.demo.model.Product
import com.example.demo.service.ProductService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("products")
class ProductController (private val productService: ProductService) {
    @GetMapping
    fun getAll() = productService.findAll()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody product: Product) = productService.save(product)

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    fun getById(@PathVariable id: Long) = productService.findById(id)

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) = productService.deleteById(id)

    @PutMapping("{id}")
    fun change(@PathVariable id: Long, @RequestBody product: Product) = productService.update(id, product)
}