package com.example.testreciperest;

import com.example.testreciperest.data.IngredientRepository;
import com.example.testreciperest.data.RecipeIngredientRepository;
import com.example.testreciperest.data.RecipeRepository;
import com.example.testreciperest.helper.Measurement;
import com.example.testreciperest.models.Ingredient;
import com.example.testreciperest.models.Recipe;
import com.example.testreciperest.models.RecipeIngredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    IngredientRepository ingreRepo;
    @Autowired
    RecipeIngredientRepository recIngRepo;
    @Autowired
    RecipeRepository recRepo;

    @Override
    public void run(String... args) throws Exception {
        Ingredient salt = new Ingredient("Salt");
        ingreRepo.save(salt);
        Ingredient water = new Ingredient("Water");
        ingreRepo.save(water);
        Recipe saltWaterRecipe = new Recipe("Saltwater");
        recRepo.save(saltWaterRecipe);
        RecipeIngredient recSalt = new RecipeIngredient(salt, 1.0, Measurement.CL, saltWaterRecipe);
        RecipeIngredient recWater = new RecipeIngredient(water, 1.0, Measurement.CL, saltWaterRecipe);
        recIngRepo.save(recSalt);
        recIngRepo.save(recWater);
        saltWaterRecipe.addIngredient(recSalt);
        saltWaterRecipe.addIngredient(recWater);
        ingreRepo.findAll().forEach(System.out::println);
        recRepo.findAll().forEach(System.out::println);

    }
}
