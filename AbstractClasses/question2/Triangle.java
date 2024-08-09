package OOPS.AbstractClasses.question2;

public class Triangle extends Shape{
    int a,b,c, base,height;

    public Triangle(int a, int b, int c, int base, int height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.height = height;
    }

    @Override
    float calculateArea() {
        int i = base * height;
        float area =(float)(0.5*i);
        return area;
    }

    @Override
    float calculatePerimeter() {
        float perimeter = a+b+c;
        return perimeter;
    }
}
