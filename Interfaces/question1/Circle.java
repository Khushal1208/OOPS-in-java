package OOPS.Interfaces.question1;

public class Circle implements  Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double area = Math.PI*radius*radius;
        System.out.println("\nArea of circle is "+area);

    }
}
