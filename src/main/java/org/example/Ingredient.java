package org.example;

public class Ingredient {
    private String name;
    private boolean bitter;
    private boolean sour;
    private int flavorRating;

    public Ingredient(String name, boolean bitter, boolean sour, int flavorRating) {
        this.name = name;
        this.bitter = bitter;
        this.sour = sour;
        this.flavorRating = flavorRating;
    }

    public String getName() {
        return name;
    }

    public boolean isBitter() {
        return bitter;
    }
}