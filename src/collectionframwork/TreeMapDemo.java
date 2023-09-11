package collectionframwork;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(10,"Pune");
        treeMap.put(20,"Mumbai");
        treeMap.put(25,"Mumbai");
        treeMap.put(30,"Satara");
        treeMap.put(40,"Sangli");
        treeMap.put(50,"Kolhapur");

        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.ceilingKey(10));
        System.out.println(treeMap.higherKey(10));

        System.out.println(treeMap.ceilingEntry(10));
        System.out.println(treeMap.higherEntry(10));
        System.out.println(treeMap.subMap(20,true,30,false));
        System.out.println(treeMap.headMap(30));
        System.out.println(treeMap.tailMap(30,false));

    }
}
