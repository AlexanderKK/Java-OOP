package _05Polymorphism._01Lab._02Shapes;

public class Circle extends Shape {

    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    private double getArea() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        return Math.PI * radius * radius;
    }

    private double getPerimeter() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        return 2 * Math.PI * radius;
    }

    @Override
    public Double calculatePerimeter() {
        if(perimeter == null) {
            perimeter = getPerimeter();
        }

        return perimeter;
    }

    @Override
    public Double calculateArea() {
        return getArea();
    }

}
