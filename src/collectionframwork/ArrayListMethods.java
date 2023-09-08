package collectionframwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        Collections.sort(list1);

        System.out.println(list1.get(0));
        System.out.println(list1.contains(109));
        System.out.println(list1.indexOf(30));
        System.out.println(list1.hashCode());
        System.out.println(list1.isEmpty());
        System.out.println(list1.size());
        System.out.println(list1.subList(0,2));
        System.out.println(list1.remove(1));

//        list1.clear();
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(50);
        list2.add(60);

//        list1.addAll(list2);
//        list1.removeAll(list2);
//        list1.retainAll(list2);

//        System.out.println(list1.containsAll(list2));
//        System.out.println(list1.equals(list2));
//        System.out.println(list1);


    }
}
