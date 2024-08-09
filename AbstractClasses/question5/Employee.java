package OOPS.AbstractClasses.question5;
//Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
//Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods
//to calculate salary and display information for each role
public abstract class Employee {
    private String name;
    private int exprience;
    private double bonus;

    public Employee(String name, int exprience, double bonus) {
        this.name = name;
        this.exprience = exprience;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExprience() {
        return exprience;
    }

    public void setExprience(int exprience) {
        this.exprience = exprience;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public abstract double calculateSalary() ;
    public abstract String displayInfo();
}
