package collectionframwork;

import java.util.LinkedList;
import java.util.List;
//1. arraylist uses doubly linked list to store element
//2. arraylist maintain insertion order
//3. arraylist stores duplicate elements
public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.offer(50);

        list.addFirst(5);
        list.addLast(55);
        System.out.println(list.element());
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getLast());
        System.out.println(list.get(0));
        System.out.println(list.contains(109));
        System.out.println(list.indexOf(30));
        System.out.println(list.hashCode());
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.subList(0,2));
        System.out.println(list.remove(1));

    }
}
