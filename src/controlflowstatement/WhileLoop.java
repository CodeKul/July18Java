package controlflowstatement;

public class WhileLoop {

    public static void main(String[] args) {

        int[] arr = new int[4];//primitive
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        for (int j=0;j<arr.length;j++){ //traditional for loop
            System.out.println(arr[j]);
        }

        int i =0;
        while (i<arr.length){
            System.out.println(arr[i]);
            i++;
        }

        do{
            System.out.println(arr[i]);
            i++;
        }while (i<arr.length);
    }
}
