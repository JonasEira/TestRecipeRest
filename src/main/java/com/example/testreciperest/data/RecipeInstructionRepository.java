package com.example.testreciperest.data;

import com.example.testreciperest.models.RecipeInstruction;
import org.springframework.data.repository.CrudRepository;

public interface RecipeInstructionRepository extends CrudRepository<RecipeInstruction, Integer> {
}
