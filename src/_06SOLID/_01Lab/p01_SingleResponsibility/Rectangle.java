package _06SOLID._01Lab.p01_SingleResponsibility;

import java.awt.geom.Point2D;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point2D point, double width, double height) {
        super(point);

        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

}
