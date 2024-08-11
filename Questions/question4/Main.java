package OOPS.Questions.question4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius of the cirle is "+circle.getRadius());
        System.out.println("area and circumference : "+circle.area()+" "+circle.circumference());
        circle.setRadius(7.7);
        System.out.println("area and circumference : "+circle.area()+" "+circle.circumference());

    }
}
