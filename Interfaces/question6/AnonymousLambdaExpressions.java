package OOPS.Interfaces.question6;

@java.lang.FunctionalInterface
interface Drawables {
    void draw();
}

public class AnonymousLambdaExpressions {
    public static void main(String[] args) {

        //Anonymous classes.
//Use Case
//Anonymous Class: Can be used to create instances of interfaces, abstract classes, and concrete classes.
//It allows you to define methods and fields within the anonymous class.
//The this keyword refers to the instance of the anonymous class.
//        Drawable drawable = new Drawable() {
//            @Override
//            public void draw() {
//                System.out.println(this.getClass().getName());
//            }
//        };

        Drawables rectangle = new Drawables() {
            @Override
            public void draw() {
                System.out.println("Drawing Rectangle.");
            }
        };


        //Lambda Expressions
//Use Case
//Lambda Expression: Specifically designed for functional interfaces (interfaces with a single abstract method).
// They cannot have fields or additional methods.
//The this keyword refers to the enclosing class instance, not the lambda expression itself.
//class EnclosingClass {
//    Drawable drawable = () -> System.out.println(this.getClass().getName());
// }

        Drawable triangle = ()-> System.out.println("Drawing Traingle.");
        Drawable cirlce = ()-> System.out.println("Drawing Cicle.");

        rectangle.draw();
        triangle.draw();
        cirlce.draw();


    }

}
