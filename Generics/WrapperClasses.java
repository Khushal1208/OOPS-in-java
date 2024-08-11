package OOPS.Generics;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer obj = new Integer(12);
        Integer obj2 = Integer.valueOf(12);
        Integer obj4 = Integer.valueOf("12");
        if(obj2.equals(obj4)) System.out.println("equal");
        Integer obj3 = 12;
        int age = obj;

        Boolean myboolean = Boolean.valueOf("false");



    }
}
