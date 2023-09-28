package _05Polymorphism._01Lab._02Shapes;

public abstract class Shape {

    protected Double perimeter;
    protected Double area;

    protected abstract Double calculatePerimeter();
    protected abstract Double calculateArea();

}
