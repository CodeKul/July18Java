package controlflowstatement;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int num = 0, guessNo;
        Scanner scanner = new Scanner(System.in);
        guessNo = (int) (Math.random() * 100) + 1;

        do {
            System.out.println("Enter number");
            num = scanner.nextInt();
            if (guessNo > num) {
                System.out.println("guess number is greater");
            } else if (guessNo < num) {
                System.out.println("guess number is smaller");
            } else {
                System.out.println("you guess correct");
            }
        } while (guessNo != num);
    }
}
