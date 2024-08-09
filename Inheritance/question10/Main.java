package OOPS.Inheritance.question10;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Avril Aroldo", "1 ABC St", "Manager",80000.0, 5);
        Developer developer = new Developer("Iver Dipali", "2 PQR St", "Developer",72000.0 , "Java");
        Programmer programmer = new Programmer("Yaron Gabriel", "3 ABC St", "Programmer",76000.0, "Python",6);

        System.out.println("Manager's Bonus: $" + manager.calculateBonus());
        System.out.println("Developer's Bonus: $" + developer.calculateBonus());
        System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());

        System.out.println(manager.generatePerformanceReport());
        System.out.println(developer.generatePerformanceReport());
        System.out.println(programmer.generatePerformanceReport());

        manager.manageProject();
        developer.writeCode();
        programmer.debugCode();
    }
}
