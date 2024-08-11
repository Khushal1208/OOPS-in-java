package OOPS.Questions.question14;

public class Teacher {


    private  String name;
    private String subject;
    private String phoneNum;

    public Teacher(String name, String subject, String phoneNum) {
        this.name = name;
        this.subject = subject;
        this.phoneNum = phoneNum;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String printDetailsOfTeacher(){
        return  "Name: "+name+"\n phoneNum: "+phoneNum ;
    }
}
