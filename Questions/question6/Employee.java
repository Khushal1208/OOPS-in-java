package OOPS.Questions.question6;
//Write a Java program to create a class called "Employee" with a name, job title,
// and salary attributes, and methods to calculate and update salary.
public class Employee {
    private String name , job_title;
    private double salary;

    public Employee(String name, String job_title, double salary) {
        this.name = name;
        this.job_title = job_title;
        this.salary = salary;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public  void  raiseSalary(double percentage){
        salary = salary + salary*percentage/100;
    }
    public void printEmployeeDetails(){
        System.out.println("Name : "+name+ ", Job title : "+job_title+", Salary : "+ salary);
    }
}
