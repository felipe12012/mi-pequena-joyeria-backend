package com.joya.mi_pequena_joya.service;

import com.joya.mi_pequena_joya.model.Product;
import com.joya.mi_pequena_joya.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository repo;
    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }
    public List<Product> getAllProducts() {
        return repo.findAll();
    }
    public Product save(Product p){
        return repo.save(p);
    }

    public boolean sellProduct(Long id, int quantity) {
        Optional<Product> optional = repo.findById(id);
        if (optional.isPresent()) {
            Product p = optional.get();
            if (p.getStock() >= quantity) {
                p.setStock(p.getStock() - quantity);
                repo.save(p);
                return true;
            }
        }
        return false;
    }
}
