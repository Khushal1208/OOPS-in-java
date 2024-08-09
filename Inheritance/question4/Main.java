package OOPS.Inheritance.question4;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(20000);
        HRManager hrManager = new HRManager(50000);

        employee.work();
        System.out.println("Employee salary is "+employee.getSalary());

        hrManager.work();
        System.out.println("HRManager salary is "+hrManager.getSalary());
        hrManager.addEmployee();
    }
}
