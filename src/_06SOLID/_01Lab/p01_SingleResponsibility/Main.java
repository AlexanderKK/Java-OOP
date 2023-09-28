package _06SOLID._01Lab.p01_SingleResponsibility;

import _06SOLID._01Lab.p02_OpenClosedPrinciple.p02_DrawingShape.Circle;

import java.awt.*;
import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        Point2D point = new Point(97, 98);
        Rectangle rectangle = new Rectangle(point, 3, 2);
//        Shape circle = new Circle(13);

        DrawingRectangle drawingRectangle = new DrawingRectangle(new ConsoleRenderer());

        try {
            drawingRectangle.draw(rectangle);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
