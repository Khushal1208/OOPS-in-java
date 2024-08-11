package OOPS.Questions.question3;
//Write a Java program to create a class called "Rectangle" with width and height attributes.
// Calculate the area and perimeter of the rectangle.
public class Rectangle {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area(){
        return width*height;
    }
    public double parameter(){
        return 2*(width+height);
    }

}
