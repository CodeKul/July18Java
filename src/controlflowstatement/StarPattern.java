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
//        star();


        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++) {
                if ((i == 2 && j == 2) || (i == 2 && j == 3)|| (i==3&&j==2) || (i==3&&j==3)) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1;i<=4;i++){

            for(int j=i;j<=4;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
