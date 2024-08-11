package OOPS.Questions.question9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Vicky",250000, LocalDate.parse("2020-01-08"));
        Employee emp2 = new Employee("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
        Employee emp3 = new Employee("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));
        Employee emp4 = new Employee("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
        emp1.printEmployeeDetails();
        emp2.printEmployeeDetails();
        emp3.printEmployeeDetails();
        emp4.printEmployeeDetails();
    }
}
