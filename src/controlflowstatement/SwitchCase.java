package controlflowstatement;

public class SwitchCase {

    public static void main(String[] args) {

        int day = 6;

        switch (day){

//            if(day==1){
//                System.out.println("Mon");
//            }else if(day==2){
//                System.out.println("Tue");
//
//            }
            case 1 ->
                System.out.println("Mon");

            case 2 ->
                System.out.println("Tue");

            case 3->
                System.out.println("Wed");

            case 4->
                System.out.println("Thur");

            case 5->
                System.out.println("Fri");

            case 6->
                System.out.println("Sat");

            case 7->
                System.out.println("Sun");

            default->
                System.out.println("invalid input");

        }

    }
}
