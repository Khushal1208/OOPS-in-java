package OOPS.Questions.question10;

import java.util.ArrayList;

//Write a Java program to create a class called "Student" with a name, grade,
//and courses attributes, and methods to add and remove courses.
public class Student {
    private String name,grade;
    private ArrayList<String> courses ;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }
    public void addCourse(String course){
        courses.add(course);
    }
    public void removeCourse(String course){
        courses.remove(course);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}
