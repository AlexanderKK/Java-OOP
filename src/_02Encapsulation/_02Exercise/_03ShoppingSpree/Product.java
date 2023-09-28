package _02Encapsulation._02Exercise._03ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    private void setName(String name) {
        ensureName(name);

        this.name = name;
    }

    private void setCost(double cost) {
        ensureMoney(cost);

        this.cost = cost;
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

    public double getCost() {
        return cost;
    }
}
