package _06SOLID._02Exercise.products.food;

import _06SOLID._02Exercise.interfaces.Product;

public abstract class Food implements Product {

    private final double grams;
    private final double caloriesPer100Grams;

    public Food(double grams, double caloriesPer100Grams) {
        this.grams = grams;
        this.caloriesPer100Grams = caloriesPer100Grams;
    }

    public double getGrams() {
        return grams;
    }

    public double getKilograms() {
        return grams / 1000;
    }

    @Override
    public double getCalories() {
        return caloriesPer100Grams / 100 * grams;
    }

}
