package com.joya.mi_pequena_joya.config;
import com.joya.mi_pequena_joya.model.Product;
import com.joya.mi_pequena_joya.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {
    private final ProductRepository repo;

    public DataSeeder(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        if (repo.count() == 0) {
            repo.save(new Product("Anillo de plata", "Hecho a mano", "Anillos", 19990, 10));
            repo.save(new Product("Collar de oro", "18 quilates", "Collares", 49990, 5));
            repo.save(new Product("Pulsera artesanal", "Cuero genuino", "Pulseras", 14990, 20));
            repo.save(new Product("Aros minimalistas", "Diseño moderno", "Aros", 8990, 15));
            System.out.println("📦 Datos de prueba insertados correctamente.");
        }
    }
}
