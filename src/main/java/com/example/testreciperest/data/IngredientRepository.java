package com.example.testreciperest.data;

import com.example.testreciperest.models.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
}
