package controlflowstatement;

import java.util.Scanner;

public class SumExample {
    public static void main(String[] args) {


        int num,sum=0;
        Scanner sc = new Scanner(System.in);
        char choice;
        do{
            System.out.println("Enter value");
            num = sc.nextInt();
            sum = sum + num;

            System.out.println("do you want to continue");
            choice = sc.next().charAt(0);
        }while (choice=='Y' || choice=='y');

        System.out.println("sum is -> "+sum);
    }
}
