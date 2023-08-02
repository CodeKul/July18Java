package controlflowstatement;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        int i;
        int j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value 1");
        i = scanner.nextInt();
        System.out.println("enter value 2");
        j = scanner.nextInt();
        System.out.println(i+" "+j);

    }
}
