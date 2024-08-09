package OOPS.Inheritance.question4;

public class HRManager extends Employee{
    public HRManager(int salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("\n Managing Employee");
    }
    public void addEmployee(){
        System.out.println("Adding new Employees");
    }


}
