package OOPS.AbstractClasses.question4;

public class Deer extends  Animal{
    @Override
    void eat() {
        System.out.println("Deer eats grass. he is veg .");
    }

    @Override
    void sleep() {
        System.out.println("Deer sleep well but he is very alert , so that no one can hunt.");
    }
}
