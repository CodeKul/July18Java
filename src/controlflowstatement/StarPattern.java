package controlflowstatement;

public class StarPattern {
    public static void star() {
        int i = 1;
        while (i <= 4) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        star();
    }
}
