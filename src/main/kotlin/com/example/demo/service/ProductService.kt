package com.example.demo.service

import com.example.demo.model.Product
import com.example.demo.repository.ProductRepository
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.getOrNull

@Service
class ProductService(private val productRepository: ProductRepository) {
    fun findAll() : Iterable<Product> = productRepository.findAll()
    fun findById(id: Long) : Product? = productRepository.findById(id).getOrNull()
    fun save(product: Product) : Product = productRepository.save(product)
    fun deleteById(id: Long) = productRepository.deleteById(id)
    fun update(id: Long, product: Product) : Product = productRepository.save(product.copy(id = id))
}