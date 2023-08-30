package collectionframwork;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1. arraylist uses dynamic array to store element
//2. arraylist maintain insertion order
//3. arraylist stores duplicate elements
public class ArrayListDemo {

    public static void main(String[] args) {


        int[] arr = new int[10];
        arr[0] = 10;

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println(arrayList);

        List list = new ArrayList();
        list.add(10);
        list.add("hii");
        list.add(false);

        List<String> arr1 = new ArrayList<>();
        arr1.add("Pune");
        arr1.add("Mumbai");

        arr1.forEach(s->{
            System.out.println(s);
        });

//        try {
//            System.out.println(getCapacity(arrayList));
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = Arrays.asList(1,2,34,4);

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,34,4));

        List<Integer> list4 = List.of(1,2,34,3);
        List<Integer> list5 = new ArrayList<>(){{add(1);add(2);}};
    }

    static int getCapacity(List al) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }


}
