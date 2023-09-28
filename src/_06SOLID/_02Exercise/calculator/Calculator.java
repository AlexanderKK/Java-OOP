package _06SOLID._02Exercise.calculator;

import _06SOLID._02Exercise.interfaces.Product;

import java.util.List;

public interface Calculator {

    double total(List<Product> products);

    double average(List<Product> products);

}
