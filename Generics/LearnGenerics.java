package OOPS.Generics;

import java.util.ArrayList;

public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String,Integer> dog1 = new Dog<>("wfdfsdge1322",122);
        Dog<Integer,String> dog2 = new Dog<>(233,"dweafd");
        System.out.println(dog1.getId());
        System.out.println(dog2.getId());

        ArrayList<Integer > a = new ArrayList<>();

    }
}
class Dog<E,V>{
    E id;
    V name;

    public E getId() {
        return id;
    }
//    V name;

    public Dog(E id,V Name) {
        this.id = id;
        this.name = name;
    }
}
