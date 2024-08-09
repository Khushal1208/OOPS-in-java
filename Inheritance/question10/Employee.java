package OOPS.Inheritance.question10;
// Write a Java program that creates a class hierarchy for employees of a company. The base class should be
// Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such
// as name, address, salary, and job title. Implement methods for calculating bonuses, generating
// performance reports, and managing projects.
public abstract class Employee {
    private String name,address,jobTitle;
    private double salary;

    public Employee(String name, String address, String jobTitle, double salary) {
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public abstract double calculateBonus();
    public abstract String generatePerformanceReport();;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }
}
