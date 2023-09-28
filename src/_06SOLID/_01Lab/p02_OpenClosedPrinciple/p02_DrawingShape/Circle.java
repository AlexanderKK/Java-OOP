package _06SOLID._01Lab.p02_OpenClosedPrinciple.p02_DrawingShape;

import _06SOLID._01Lab.p01_SingleResponsibility.Shape;

import java.awt.geom.Point2D;

public class Circle extends Shape {

    private double radius;

    public Circle(Point2D coords, double radius) {
        super(coords);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
