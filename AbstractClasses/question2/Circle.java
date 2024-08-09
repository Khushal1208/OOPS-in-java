package OOPS.AbstractClasses.question2;

public class Circle extends Shape{
    int radius ;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    float calculateArea() {
        float area = (float) (Math.PI*radius*radius);
        return area;
    }

    @Override
    float calculatePerimeter() {
        float perimeter = (float)(2*Math.PI*radius);
        return perimeter;
    }
}
