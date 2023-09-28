package _06SOLID._01Lab.p01_SingleResponsibility;

public class ConsoleRenderer implements Renderer {

    @Override
    public void render(Shape shape) {
        System.out.println("Area is: " + shape.getArea());
    }

}
