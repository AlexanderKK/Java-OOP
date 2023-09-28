package _03Inheritance._02Exercise._05Restaurant;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product product = new Salmon("wild salmon", BigDecimal.valueOf(12));
        System.out.println(product.getPrice());
    }
}
