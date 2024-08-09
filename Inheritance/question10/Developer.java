package OOPS.Inheritance.question10;

public class Developer  extends Employee{
    private String programmingLanguage;

    public Developer(String name, String address, String jobTitle, double salary, String programmingLanguage) {
        super(name, address, jobTitle, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.1;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for Developer " + getName() + ": Good";
    }

    public String writeCode() {
        // Custom method for writing code
        return ("Developer " + getName() + " is writing code in " + programmingLanguage);
    }
}
