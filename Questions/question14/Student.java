package OOPS.Questions.question14;

public class Student {
    private String name,division;
    private int rollNum;

    public Student(String name, String division, int rollNum) {
        this.name = name;
        this.division = division;
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public String getDivision() {
        return division;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void setRollNUm(int rollNum) {
        this.rollNum = rollNum;
    }
    public String printDetailsOfStudents(){
        return  ("\nName: "+name+"\n RollNUm: "+rollNum + "\n Division: "+ division);
    }
}
