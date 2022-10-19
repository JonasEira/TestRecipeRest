package com.example.testreciperest.data;

import com.example.testreciperest.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
}
