package OOPS.Questions.question10;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("khushal","A");
        Student student2 = new Student("Nakeisha Uhuru", "B");
        Student student3 = new Student("Gabriella Cherice", "C");
        Student student4 = new Student("Carolus Vitali", "O");

        System.out.println("Student Details:");
        student1.printStudentDetails();
        student2.printStudentDetails();
        student3.printStudentDetails();

        System.out.println("\nAdding courses for " + student1.getName());
        student1.addCourse("Physics");
        student1.addCourse("Chemistry");
        student1.addCourse("Maths");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

        System.out.println("\nAdding courses for " + student2.getName());
        student2.addCourse("History");
        student2.addCourse("Geography");
        student2.addCourse("English");
        System.out.println(student2.getName() + "'s courses: " + student2.getCourses());

        System.out.println("\nRemoving 'Physics' course for " + student1.getName());
        student1.removeCourse("Physics");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
    }
}
