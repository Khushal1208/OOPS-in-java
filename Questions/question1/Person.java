package OOPS.Questions.question1;
// Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class,
// set their attributes using the constructor, and print their name and age.
public class Person {
    String name;
    int age ;
//    if this variables are private than i cant directly accecss it
//    so , I need to create getter and setter methods to access it ::--
//    public String getName(){
//        return name;
//    }
//    public int getAge() {
//        return age;
//    }
    public Person(String name , int age) {   // this is constructor which is taking two values
        this.name = name;
        this.age = age;
    }

}
