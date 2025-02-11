package com.celesca.microservices.product_service.controller;

import com.celesca.microservices.product_service.dto.ProductRequest;
import com.celesca.microservices.product_service.model.Product;
import com.celesca.microservices.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody ProductRequest productRequest) {
        // Create product
        return productService.createProduct(productRequest);
    }
}
