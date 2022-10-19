package com.example.testreciperest.data;

import com.example.testreciperest.models.RecipeIngredient;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface RecipeIngredientRepository extends CrudRepository<RecipeIngredient, UUID> {
}
