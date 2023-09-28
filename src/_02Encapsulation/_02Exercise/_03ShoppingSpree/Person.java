package _02Encapsulation._02Exercise._03ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    private void setName(String name) {
        ensureName(name);

        this.name = name;
    }

    private void setMoney(double money) {
        ensureMoney(money);

        this.money = money;
    }

    private void ensureName(String name) {
        if(name.trim().isEmpty()) {
            throw new IllegalStateException("Name cannot be empty");
        }
    }

    private void ensureMoney(double money) {
        if(money < 0) {
            throw new IllegalStateException("Money cannot be negative");
        }
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product) {
        if(money < product.getCost()) {
            throw new IllegalStateException(String.format("%s can't afford %s", name, product.getName()));
        }

        products.add(product);
        money -= product.getCost();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" - ");
        sb.append(products.isEmpty() ? "Nothing bought" : products.stream().map(Product::getName).collect(Collectors.joining(", ")));

        return sb.toString();
    }
}
