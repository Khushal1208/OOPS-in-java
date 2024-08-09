package OOPS.Interfaces.question1;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(3,4);
        Shape rectangle = new Rectangle(5,2);
        circle.getArea();
        triangle.getArea();
        rectangle.getArea();
    }
}
