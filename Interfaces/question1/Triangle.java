package OOPS.Interfaces.question1;

public class Triangle implements Shape {
    int base,height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void getArea() {
     double area = 0.5*base*height;
        System.out.println("\nArea of Triangle is "+area);
    }
}
