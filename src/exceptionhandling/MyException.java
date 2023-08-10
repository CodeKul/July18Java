package exceptionhandling;

public class MyException {
    public static void main(String[] args)  {

        int age =15;
        if(age>18){
            System.out.println("you can vote");
        }else {
            try {
                throw new CustomException("Age should be greater than 18");
            }catch (CustomException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
