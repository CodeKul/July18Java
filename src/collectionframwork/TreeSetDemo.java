package collectionframwork;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(11);
        treeSet.add(12);
        treeSet.add(13);
        treeSet.add(14);

        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());

        System.out.println(treeSet.ceiling(10));
        System.out.println(treeSet.floor(10));

        System.out.println(treeSet.higher(10));
        System.out.println(treeSet.lower(10));

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
    }
}
