package _06SOLID._01Lab.p01_SingleResponsibility;

import java.awt.*;
import java.awt.geom.Point2D;
import java.io.Console;

public class DrawingRectangle extends DrawingManagerImpl implements DrawingManagerRectangle {

    public DrawingRectangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw(Rectangle rectangle) {
        char[][] matrix = new char[100][100];

        Point2D initPoint = rectangle.getCoords();
        int x = (int) initPoint.getX();
        int y = (int) initPoint.getY();

        if(x > 100 || y > 100) {
            throw new IllegalStateException("Coordinates out of matrix boundaries [100, 100]");
        }

        if(x + rectangle.getWidth() > 100 || y + rectangle.getHeight() > 100) {
            throw new IllegalStateException("Rectangle out of matrix boundaries [100, 100]");
        }

        for (double i = y; i < y + rectangle.getHeight(); i++) {
            for (double j = x; j < x + rectangle.getWidth(); j++) {
                matrix[(int) i][(int) j] = '.';
            }
        }

        for (char[] row : matrix) {
            for (char point : row) {
                System.out.print(point);
            }

            System.out.println();
        }

        super.renderer.render(rectangle);
    }

}
