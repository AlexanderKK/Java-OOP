package _06SOLID._01Lab.p03_LiskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(12, 13);
        Shape square = new Square(12);

        printShape(rectangle);
        printShape(square);
    }

    private static void printShape(Shape shape) {
        System.out.println(shape.getArea());
    }
}
