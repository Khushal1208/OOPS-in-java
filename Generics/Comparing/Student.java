package OOPS.Generics.Comparing;

public class Student implements Comparable<Student>{
    int roolno;
    float mark;

    public Student(int roolno, float mark) {
        this.roolno = roolno;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
