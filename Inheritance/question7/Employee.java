package OOPS.Inheritance.question7;

public class Employee extends Person {
    private  String empId,jobTitle;

    public Employee(String firstName, String lastName, String empId,String jobTitle) {
        super(firstName, lastName);
        this.empId = empId;
        this.jobTitle = jobTitle;
    }

    public String getEmpId() {
        return empId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() +"\nJob Title: "+jobTitle;
    }
}
