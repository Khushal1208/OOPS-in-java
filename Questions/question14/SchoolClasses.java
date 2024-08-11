package OOPS.Questions.question14;

import java.util.ArrayList;

public class SchoolClasses {
    private String className;
    private Teacher teacher;
    private ArrayList<Student> students ;

    public SchoolClasses(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<Student>();
    }

    public String getClassName() {
        return className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }



}
