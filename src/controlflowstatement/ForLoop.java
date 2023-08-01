package controlflowstatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        int i = 10;

        int[] arr = new int[4];//primitive
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        System.out.println(arr.length);

        for (int j=0;j<arr.length;j++){ //traditional for loop
            System.out.println(arr[j]);
        }

        System.out.println();
        for(int j = arr.length-1; j>=0;j--){
            System.out.println(arr[j]);
        }

        System.out.println();
        for (int k:arr) { // enhanced for loop
            System.out.println(k);
        }

        List<Integer> list = Arrays.asList(1,2,3,4); //collection framework


        list.forEach(System.out::println);


    }
}
