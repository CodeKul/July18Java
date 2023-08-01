package controlflowstatement;

public class IfElse {
    public static void main(String[] args) {

        int age =15;
        if(age>=18){
            System.out.println("you can vote");
        }else {
            System.out.println("you cannot vote");
        }

        int a = 150,b =270,c=30;
        if(a>b && a>c){
            System.out.println("a is greater");
        }else if(b>c){
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }

        int age1 =15;
        String nationality = "India";
        if(age1>=18){
            if(nationality.equals("Indian")) { //nested if
                System.out.println("you can vote");
            }else {
                System.out.println("not indian");
            }
        }else {
            System.out.println("you cannot vote");
        }

    }
}
