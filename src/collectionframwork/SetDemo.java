package collectionframwork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(30);
        set.add(40);

        System.out.println(set);

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(10);
        set1.add(30);
        set1.add(40);

        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(10);
        set2.add(10);
        set2.add(300);
        set2.add(40);

        System.out.println(set2);



    }
}
