package _06SOLID._02Exercise.products.drink;

import _06SOLID._02Exercise.interfaces.Product;

public abstract class Drink implements Product {

    private final double milliliters;
    private final double caloriesPer100Grams;
    private final double density;

    public Drink(double milliliters, double caloriesPer100Grams, double density) {
        this.milliliters = milliliters;
        this.caloriesPer100Grams = caloriesPer100Grams;
        this.density = density;
    }

    public double getMilliliters() {
        return milliliters;
    }

    public double getLiters() {
        return milliliters / 1000;
    }

    @Override
    public double getCalories() {
        double grams = milliliters * density;

        return caloriesPer100Grams / 100 * grams;
    }

    @Override
    public double getKilograms() {
        return getLiters() * density;
    }

}
