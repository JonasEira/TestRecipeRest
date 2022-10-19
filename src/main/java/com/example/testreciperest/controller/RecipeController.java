package com.example.testreciperest.controller;

import com.example.testreciperest.data.RecipeRepository;
import com.example.testreciperest.models.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RecipeController {

    RecipeRepository recRepo;

    @Autowired
    public RecipeController(RecipeRepository repo){
        recRepo = repo;
    }

    @GetMapping("/recipe")
    public ResponseEntity<List<Recipe>> getRecipe(){
        Iterable<Recipe> test = recRepo.findAll();
        List<Recipe> result = new ArrayList<Recipe>();
        test.forEach(result::add);
        return ResponseEntity.ok(result);
    }
}
