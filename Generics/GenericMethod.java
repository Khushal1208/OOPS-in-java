package OOPS.Generics;

public class GenericMethod {
    public static void main(String[] args) {
        printData("Hello");
        printData(132 );

        GenericMethod obj = new GenericMethod();
//        obj.doubleData("112");
        obj.doubleData(123);

        CustomClass custom = new CustomClass();
//        obj.doubleData(custom);
    }

   static <E> void printData(E data)  {
        System.out.println(data);
    }
    <E extends Number> void doubleData(E data){
        System.out.println(data);
    }
}

class CustomClass{

}
