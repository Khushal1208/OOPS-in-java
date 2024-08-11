package OOPS.Questions.question6;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Emma", "Teacher",32443);
        Employee emp2 = new Employee("jasy", "professor",53443);
        emp1.printEmployeeDetails();
        emp2.printEmployeeDetails();

        emp1.raiseSalary(65);
        emp1.setJob_title("Professor");

        emp2.raiseSalary(79);
        emp2.setJob_title("HOD");

        System.out.println("\nAfter the promotion both employees new details are :\n ");
        emp1.printEmployeeDetails();
        emp2.printEmployeeDetails();


    }
}
