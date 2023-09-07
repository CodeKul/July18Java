package collectionframwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(120);
        arrayList.add(150);
        arrayList.add(302);
        arrayList.add(403);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
