package com.project.Repository;



//import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
