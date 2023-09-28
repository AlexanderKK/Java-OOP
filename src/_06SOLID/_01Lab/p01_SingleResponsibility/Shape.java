package _06SOLID._01Lab.p01_SingleResponsibility;

import java.awt.geom.Point2D;

public abstract class Shape {

    private final Point2D coords;

    public Shape(Point2D coords) {
        this.coords = coords;
    }

    public Point2D getCoords() {
        return coords;
    }

    public abstract double getArea();

}
