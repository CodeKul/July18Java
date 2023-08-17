package filehandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);

        List<Integer> res = new ArrayList<>();
        res.addAll(list);
        res.remove(list.size()-1);
        res.addAll(list.stream().sorted(Collections.reverseOrder()).toList());

    }
}
