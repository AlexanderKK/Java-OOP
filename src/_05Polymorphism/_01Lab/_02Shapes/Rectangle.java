package _05Polymorphism._01Lab._02Shapes;

public class Rectangle extends Shape {

    private final Double width;
    private final Double height;

    public final Double getWidth() {
        return width;
    }

    public final Double getHeight() {
        return height;
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    private double getArea() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        return width * height;
    }

    private double getPerimeter() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        return 2 * (width + height);
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
