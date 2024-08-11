package OOPS.Questions.question16;
public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerameter(){
        return 2*Math.PI*radius;
    }

}
