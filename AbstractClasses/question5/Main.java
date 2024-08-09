package OOPS.AbstractClasses.question5;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("khushal",5,2000,2);
        Programmer programmer = new Programmer("sonu",2,10000,"python");
        System.out.println(manager.displayInfo());
        System.out.println("\n"+programmer.displayInfo());

    }
}
