package OOPS.Questions.question4;
//Write a Java program to create a class called "Circle" with a radius attribute.
//You can access and modify this attribute. Calculate the area and circumference of the circle.
public class Circle {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double radius;
    public Circle( double radius){
        this.radius = radius;
    }

    public double area(){
        return 3.14*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }

}
