package OOPS.Inheritance.question3;

public class Rectangle extends Shape{
    int sideA,sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void getArea(){
        System.out.println("The Area of the rectangle:");
        int area = sideA*sideB;
        System.out.println(area);
    }
}
