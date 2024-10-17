package com.project.Repository;



//import com.example.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
