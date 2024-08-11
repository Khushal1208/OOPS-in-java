package OOPS.Questions.question2;
// Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class,
// set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
public class Dog {
    private String name;
    private String Bread ;

    public Dog(String name, String bread) {
        this.name = name;
        Bread = bread;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return Bread;
    }

    public void setBread(String bread) {
        Bread = bread;
    }
}
