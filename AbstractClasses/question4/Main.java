package OOPS.AbstractClasses.question4;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();
        lion.eat();
        lion.sleep();
        System.out.println();
        tiger.eat();
        tiger.sleep();
        System.out.println();
        deer.eat();
        deer.sleep();
    }
}
