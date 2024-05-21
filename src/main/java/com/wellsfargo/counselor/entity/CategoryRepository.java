package com.wellsfargo.counselor.entity;

import com.wellsfargo.counselor.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
