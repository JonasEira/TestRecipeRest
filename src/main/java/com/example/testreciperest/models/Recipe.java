package com.example.testreciperest.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String recipeName;
    @OneToMany(mappedBy = "recipe", fetch = FetchType.EAGER)
    List<RecipeIngredient> recipeIngredients;
    @OneToOne
    RecipeInstruction instruction;
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    Set<RecipeCategory> categories;

    public Recipe() {
    }

    public Recipe(String recipeName, List<RecipeIngredient> recipeIngredients, RecipeInstruction instruction, Set<RecipeCategory> categories) {
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
        this.instruction = instruction;
        this.categories = categories;
    }

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
        setRecipeIngredients(new ArrayList<>());
        setCategories(new HashSet<>());
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void addIngredient(RecipeIngredient recIngredient) {
        this.recipeIngredients.add(recIngredient);
        recIngredient.setRecipe(this);
    }

    public List<RecipeIngredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(List<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public RecipeInstruction getInstruction() {
        return instruction;
    }

    public void setInstruction(RecipeInstruction instruction) {
        this.instruction = instruction;
    }

    public Set<RecipeCategory> getCategories() {
        return categories;
    }

    public void setCategories(Set<RecipeCategory> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", recipeName='" + recipeName + '\'' +
                ", recipeIngredients=" + recipeIngredients +
                ", instruction=" + instruction +
                ", categories=" + categories +
                '}';
    }
}
