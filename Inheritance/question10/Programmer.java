package OOPS.Inheritance.question10;

public class Programmer extends  Developer {
    private int experience;

    public Programmer(String name, String address, String jobTitle, double salary, String programmingLanguage, int experience) {
        super(name, address, jobTitle, salary, programmingLanguage);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.3;
    }
    @Override

    public String generatePerformanceReport() {
        // Custom implementation for performance report for programmers
        return "Performance report for Programmer " + getName() + ": Excellent";
    }

    public String debugCode() {
        // Custom method for debugging code
        return ("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage());
    }
}
