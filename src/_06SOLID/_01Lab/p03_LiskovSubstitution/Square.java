package _06SOLID._01Lab.p03_LiskovSubstitution;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

}
