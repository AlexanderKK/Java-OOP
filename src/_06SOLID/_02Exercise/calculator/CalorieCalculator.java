package _06SOLID._02Exercise.calculator;

import _06SOLID._02Exercise.interfaces.Product;

import java.util.List;

public class CalorieCalculator implements Calculator {

    @Override
    public double total(List<Product> products) {
        return products.stream().mapToDouble(Product::getCalories).sum();
    }

    @Override
    public double average(List<Product> products) {
        return total(products) / products.size();
    }

}
