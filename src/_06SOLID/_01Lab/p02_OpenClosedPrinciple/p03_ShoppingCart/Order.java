package _06SOLID._01Lab.p02_OpenClosedPrinciple.p03_ShoppingCart;

public abstract class Order {
    protected final Cart cart;

    protected Order(Cart cart) {
        this.cart = cart;
    }

    protected void checkout(){
        //log the order in the p03_Database
    }
}
