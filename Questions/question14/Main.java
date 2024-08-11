package OOPS.Questions.question14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Student student1 = new Student("Mats Yatzil", "4A6",21);
        Student student2 = new Student("Karolina Ralf", "4A5",1);
        Student student3 = new Student("Felicie Anuschka", "4A6",20);
        Student student4 = new Student("Norbert Micha", "4A5",19);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);

        Teacher teacher1 = new Teacher("Jens Amalia", "Math","9460716915");
        Teacher teacher2 = new Teacher("Elise Giiwedin", "English","9454444714");
        Teacher teacher3 = new Teacher("Angelika Lotta", "Science","8955556993");

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);

        SchoolClasses mathClass = new SchoolClasses("Mathematics", teacher1);
        mathClass.addStudent(student1);
        mathClass.addStudent(student2);
        mathClass.addStudent(student3);
        mathClass.addStudent(student4);

        SchoolClasses englishClass = new SchoolClasses("English", teacher2);
        englishClass.addStudent(student1);
        englishClass.addStudent(student2);
        englishClass.addStudent(student3);

        SchoolClasses scienceClass = new SchoolClasses("Science", teacher3);
        scienceClass.addStudent(student1);
        scienceClass.addStudent(student2);
        scienceClass.addStudent(student3);
        scienceClass.addStudent(student4);

        school.addClasses(mathClass);
        school.addClasses(englishClass);
        school.addClasses(scienceClass);

        System.out.println("School Information");
        System.out.println("Number of students: "+school.getStudents().size());
        System.out.println("Number of Classes: "+school.getSchoolClasses().size());
        System.out.println("Number of Teachers: "+school.getTeachers().size());

        System.out.println("\nMath class information:");
        System.out.println("Class Name: "+ mathClass.getClassName());
        System.out.println("Teacher  "+ mathClass.getTeacher().printDetailsOfTeacher());
        System.out.println("Number of Students: "+mathClass.getStudents().size());

        System.out.println("\nEnglish class information");
        System.out.println("Class Name: "+englishClass.getClassName());
        System.out.println("Teacher  "+englishClass.getTeacher().printDetailsOfTeacher());
        System.out.println("Number of Students: "+englishClass.getStudents().size());

        System.out.println("\nScince class information");
        System.out.println("Class Name: "+scienceClass.getClassName());
        System.out.println("Teacher  "+ scienceClass.getTeacher().printDetailsOfTeacher());
        System.out.println("Total Students: "+scienceClass.getStudents().size());

        school.removeStudent(student1);
        school.removeTeacher(teacher2);
        school.removeClasses(mathClass);

        System.out.println("\nSchool information after removing one student, teacher and Class:");
        System.out.println("Number of students: " + school.getStudents().size());
        System.out.println("Number of teachers: " + school.getTeachers().size());
        System.out.println("Number of classes: " + school.getSchoolClasses().size());

        ArrayList<Student> students = school.getStudents();

        for(Student student:students){
            System.out.println(student.printDetailsOfStudents());
        }


    }
}
