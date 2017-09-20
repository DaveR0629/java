package com.ngm01.productscategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ngm01.productscategories.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	
}
