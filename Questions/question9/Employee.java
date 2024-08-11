package OOPS.Questions.question9;
// Write a Java program to create a class called "Employee" with a name, salary,
// and hire date attributes, and a method to calculate years of service.

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    public int  totalYearsOfService(){
        return  Period.between(hireDate,LocalDate.now()).getYears();
    }
    public void printEmployeeDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("HireDate: " + hireDate);
        System.out.println("the total years of service: "+ totalYearsOfService());
    }
}
