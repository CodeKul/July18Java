package exceptionhandling;

public class ThrowAndThrows {

    public static void main(String[] args)throws ArithmeticException,Exception{

        int age =15;
        if(age>=18){
            System.out.println("you can vote");
        }else {
            throw new ArithmeticException("You can vote");
        }

        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
    }
}

/**
 *                Throw                                        Throws
 *
 *   1. throw is used to throw exception explicitly    1. used to declare exception
 *
 *   2. throw is used within a method                  2. used with method signature
 *
 *   3. throw is used with instance of class           3. used with class name
 *
 *   4. you can throw one exception at time            4 you can declare multiple exception at time
 *
 */