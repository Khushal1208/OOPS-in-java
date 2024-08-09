package OOPS.AbstractClasses.question2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("Area of circle is "+circle.calculateArea());
        System.out.println("Perimeter of circle is "+circle.calculatePerimeter());

        Triangle triangle =new Triangle(2,3,4,5,12);
        System.out.println("\nArea of Triangle is "+triangle.calculateArea());
        System.out.println("Perimeter of Triangle is "+triangle.calculatePerimeter());
    }
}
