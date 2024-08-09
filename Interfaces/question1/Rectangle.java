package OOPS.Interfaces.question1;

public class Rectangle implements Shape{
    int height , width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void getArea() {
        double area = 2*(width+height);
        System.out.println("\nArea of Rectangle is "+area);

    }
}
