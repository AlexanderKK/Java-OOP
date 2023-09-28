package _05Polymorphism._01Lab._02Shapes;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2D, 4D);
        Shape circle = new Circle(13.4);

        printShape(rectangle);
        printShape(circle);
        printShape(rectangle);
        printShape(circle);
        printShape(rectangle);
        printShape(circle);
    }

    private static void printShape(Shape shape) {
        double begin = System.currentTimeMillis();

        System.out.println(shape.calculateArea());

        double end = System.currentTimeMillis();

        System.out.printf("Area calculation time: %f", Math.abs(begin - end));
        System.out.println();

        double firstDuration = end / 1000 - begin / 1000;

        begin = System.nanoTime() * 1.0 / 1000000000;

        System.out.println(shape.calculatePerimeter());

        end = System.nanoTime() * 1.0 / 1000000000;

        System.out.printf("Perimeter calculation time: %f", Math.abs(begin - end));
        System.out.println();

        System.out.printf("Difference is %.0f", firstDuration / Math.abs(begin - end));
    }
}
