package OOPS.Inheritance.question10;

public class Manager extends Employee{
    private int noOfSubOrdinate;

    public Manager(String name, String address, String jobTitle, double salary, int noOfSubOrdinate) {
        super(name, address, jobTitle, salary);
        this.noOfSubOrdinate = noOfSubOrdinate;
    }

    public int getNoOfSubOrdinate() {
        return noOfSubOrdinate;
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.15;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performanace report of "+getName()+" is Excellent.";
    }
    public String manageProject() {
        return getName()+" is managing Upcoming A.I. projects.";
    }
}
