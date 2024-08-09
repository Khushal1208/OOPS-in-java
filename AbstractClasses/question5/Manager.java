package OOPS.AbstractClasses.question5;

public class Manager extends Employee {
    private int noOfSubOrdinate;

    public Manager(String name, int exprience, double bonus, int noOfSubOrdinate) {
        super(name, exprience, bonus);
        this.noOfSubOrdinate = noOfSubOrdinate;
    }

    public void setNoOfSubOrdinate(int noOfSubOrdinate) {
        this.noOfSubOrdinate = noOfSubOrdinate;
    }

    public int getNoOfSubOrdinate() {
        return noOfSubOrdinate;
    }

    @Override
    public double calculateSalary() {
        return getExprience()*getBonus()+ 20000;
    }

    @Override
    public String displayInfo() {
        return "\nName: "+getName()+"\nNo of SubOrdinate: "+getNoOfSubOrdinate()+"\nExprience "+getExprience()+"\nSalary:"+calculateSalary();
    }
}
