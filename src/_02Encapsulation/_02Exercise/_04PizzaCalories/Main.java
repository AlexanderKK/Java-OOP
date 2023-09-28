package _02Encapsulation._02Exercise._04PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Read pizza data
        //2. Read Dough data
        //3. Read Topping data Until END
        //4. Validate data during reading of input and end program
        //5. Calculate calories of dough
        //6. Calculate calories of toppings
        //7. Calculate calories of pizza

        //1.
        //Pizza {pizzaName} {numberOfToppings}
        String[] pizzaParts = scanner.nextLine().split("\\s+");

        String pizzaName = pizzaParts[1];
        int numberOfToppings = Integer.parseInt(pizzaParts[2]);

        Pizza pizza;
        try {
            pizza = new Pizza(pizzaName, numberOfToppings);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }

        //2.
        //Dough {flourType} {bakingTechnique} {weightInGrams}
        String[] doughParts = scanner.nextLine().split("\\s+");

        String doughName = doughParts[1];
        String bakingTechnique = doughParts[2];
        double weightDough = Double.parseDouble(doughParts[3]);

        try {
            Dough dough = new Dough(doughName, bakingTechnique, weightDough);
            pizza.setDough(dough);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }

        //3.
        //Topping {toppingType} {weightInGrams}
        String command;
        while(!"END".equals(command = scanner.nextLine())) {
            String[] toppingParts = command.split("\\s+");

            String toppingType = toppingParts[1];
            double weightTopping = Double.parseDouble(toppingParts[2]);

            try {
                Topping topping = new Topping(toppingType, weightTopping);
                pizza.addTopping(topping);
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }

        System.out.printf("%s - %.2f%n", pizza.getName(), pizza.getOverallCalories());
    }
}
