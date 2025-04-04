package com.andrew.product_service.repository;

import com.andrew.product_service.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    boolean existsByName(String name);
    Set<Category> findByCategoryIdIn(Set<Long> ids);
}
