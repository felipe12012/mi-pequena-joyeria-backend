package com.joya.mi_pequena_joya.controller;

import com.joya.mi_pequena_joya.model.Product;
import com.joya.mi_pequena_joya.service.ProductService;
import com.joya.mi_pequena_joya.dto.SellRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController{
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @PostMapping
    public Product save(@RequestBody Product p) {
        return service.save(p);
    }

    @PostMapping("/{id}/sell")
    public String sellProduct(@PathVariable Long id, @RequestBody SellRequest request) {
        boolean success = service.sellProduct(id, request.getQuantity());
        return success ? "Ok: Vendido correctamente" : "Error: sin Stock";
    }
}