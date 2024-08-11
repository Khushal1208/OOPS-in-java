package OOPS.Questions.question14;

import java.util.ArrayList;

// Write a Java program to create a class called "School" with attributes for students, teachers,
// and classes, and methods to add and remove students and teachers, and to create classes
public class School {
    private ArrayList<Student> students;
    private ArrayList<SchoolClasses> schoolClasses;
    private ArrayList<Teacher> teachers;

    public School() {
        this.students = new ArrayList<Student>();
        this.schoolClasses = new ArrayList<SchoolClasses>();
        this.teachers = new ArrayList<Teacher>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }
    public void addClasses(SchoolClasses classes){
        schoolClasses.add(classes);
    }
    public void removeClasses(SchoolClasses classes){
        schoolClasses.remove(classes);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<SchoolClasses> getSchoolClasses() {
        return schoolClasses;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}
