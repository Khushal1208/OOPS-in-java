package OOPS.AbstractClasses.question5;

public class Programmer extends Employee {
    private String  programmingLanguage;

    public Programmer(String name, int exprience, double bonus, String programmingLanguage) {
        super(name, exprience, bonus);
        this.programmingLanguage = programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }



    public String getProgrammingLanguage() {
        return programmingLanguage;
    }


    @Override
    public double calculateSalary() {
        return getExprience()*getBonus()+100000;
    }

    @Override
    public String displayInfo() {
        return "Name: "+getName()+"\nProgramming language: "+getProgrammingLanguage()+"\nExprience "+getExprience()+"\nSalary:"+calculateSalary();
    }
}
