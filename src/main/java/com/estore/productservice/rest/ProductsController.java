package com.estore.productservice.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @PostMapping
    public String createProduct() {
        return "HTTP Post is Handled";
    }

    @GetMapping
    public String getProducts() {
        return "HTTP Get is Handled";
    }

    @PutMapping
    public String updateProduct() {
        return "HTTP Put is Handled";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "HTTP Delete is Handled";
    }
}
