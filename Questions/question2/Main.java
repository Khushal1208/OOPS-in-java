package OOPS.Questions.question2;


public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Jimmy", "Lebrra");
        Dog dog2 = new Dog("Sheru", "Jerman sheferd");
        System.out.println(dog1.getName()+" "+ dog1.getBread());
        System.out.println(dog2.getName()+" "+ dog2.getBread());
        dog1.setName("pappu");
        dog2.setName("lehru");
        dog1.setBread("zabrra");
        dog2.setBread("sarwan chefheard");

        System.out.println("this is new "+dog1.getName()+" "+ dog1.getBread());
        System.out.println("this is new "+dog2.getName()+" "+ dog2.getBread());
    }
}
