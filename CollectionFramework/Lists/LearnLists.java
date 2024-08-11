package OOPS.CollectionFramework.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnLists {
    public static void main(String[] args) {
//        int a[] = new int[5];

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

//        list.remove(1);
//        list.remove(Integer.valueOf(10));
//        System.out.println(list);
//
//        Object a[] = list.toArray();
//        for(Object e:a){
//            Integer temp = (Integer) e;
//            System.out.println(e);
//        }
        Object[] array = list.toArray();
        System.out.println(array);
        System.out.println(list);


    }
}
