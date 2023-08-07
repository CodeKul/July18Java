package controlflowstatement;

public class SortArray {
    public static void main(String[] args) {

//        int a = 10, b = 20, temp;
//        temp = a;
//        a = b;
//        b = temp;
//
//
//        System.out.println(a + " " + b);

//        a = a+b;
//        b = a-b;
//        a = a-b;
//
//        System.out.println(a+" "+b);

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        for (int i = 0, j = arr2.length - 1; i < arr1.length; i++, j--) {
            System.out.println(arr1[i] * arr2[j]);
        }

//        int temp1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    temp1 = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp1;
//                }
//            }
//            System.out.println(arr[i]);
//        }


    }
}
