package _05Polymorphism._01Lab._04WildFarm;

public abstract class Food {

    private Integer quantity;

    public Food(Integer quantity) {
        setQuantity(quantity);
    }

    private void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

}
