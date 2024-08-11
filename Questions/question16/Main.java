package OOPS.Questions.question16;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(7,8,6);
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(5,8);

        // calculate area and perimeter of each shape
        System.out.println("\nArea and perimeter of various shapes:");
        System.out.println("\nRectangle: Length-10, Width-12");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerameter());

        System.out.println("\nCircle: Radius-5");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerameter());

        System.out.println("\nTriangle: Side1-7, Side2-8, Side3-6");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerameter());
    }
}
