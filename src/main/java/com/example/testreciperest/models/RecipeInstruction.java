package com.example.testreciperest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecipeInstruction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String instructions;

    public RecipeInstruction() {
    }

    public RecipeInstruction(String instructions) {
        this.instructions = instructions;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "id=" + id +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}
