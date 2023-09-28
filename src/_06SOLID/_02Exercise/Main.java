package _06SOLID._02Exercise;

import _06SOLID._02Exercise.calculator.Calculator;
import _06SOLID._02Exercise.calculator.CalorieCalculator;
import _06SOLID._02Exercise.calculator.WeightCalculator;
import _06SOLID._02Exercise.interfaces.Product;
import _06SOLID._02Exercise.output.ConsoleOutput;
import _06SOLID._02Exercise.output.FileOutput;
import _06SOLID._02Exercise.output.Output;
import _06SOLID._02Exercise.products.food.Chips;
import _06SOLID._02Exercise.products.food.Chocolate;
import _06SOLID._02Exercise.products.drink.Coke;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Product> products = new ArrayList<>();

        Product chips = new Chips(100);
        Product chocolate = new Chocolate(120);
        Product coke = new Coke(120);

        addProduct(products, chips);
        addProduct(products, chocolate);
        addProduct(products, coke);

        Calculator calorieCalculator = new CalorieCalculator();
//        Calculator weightCalculator = new WeightCalculator();

        Output printer = new ConsoleOutput(calorieCalculator);

        printer.outputSum(products);
        printer.outputAverage(products);

        Output fileWriter = new FileOutput(calorieCalculator, "output.txt");
        fileWriter.outputSum(products);
        fileWriter.outputAverage(products);
    }

    private static void addProduct(List<Product> products, Product product) {
        products.add(product);
    }

}
