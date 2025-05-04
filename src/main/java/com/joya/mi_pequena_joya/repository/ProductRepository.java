package com.joya.mi_pequena_joya.repository;
import com.joya.mi_pequena_joya.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
