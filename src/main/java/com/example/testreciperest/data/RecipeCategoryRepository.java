package com.example.testreciperest.data;

import com.example.testreciperest.models.RecipeCategory;
import org.springframework.data.repository.CrudRepository;

public interface RecipeCategoryRepository extends CrudRepository<RecipeCategory, Integer> {
}
