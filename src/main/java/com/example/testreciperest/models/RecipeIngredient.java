package com.example.testreciperest.models;

import com.example.testreciperest.helper.Measurement;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class RecipeIngredient {
    @Id
    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
    UUID id;
    @OneToOne
    Ingredient ingredient;
    double amount;
    Measurement measurement;
    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH}
            , fetch = FetchType.EAGER)
    @JoinColumn(name = "recipe_id")
    Recipe recipe;

    public RecipeIngredient() {
    }

    public RecipeIngredient(Ingredient ingredient, double amount, Measurement measurement, Recipe recipe) {
        this.ingredient = ingredient;
        this.amount = amount;
        this.measurement = measurement;
        this.recipe = recipe;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return "RecipeIngredient{" +
                "id=" + id +
                ", ingredient=" + ingredient +
                ", amount=" + amount +
                ", measurement=" + measurement +
                '}';
    }
}
