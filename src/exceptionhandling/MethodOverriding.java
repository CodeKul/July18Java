package exceptionhandling;

import java.sql.SQLException;

public class MethodOverriding {
    public void show()throws  RuntimeException{
        System.out.println("In show");
    }
}
class Sample extends MethodOverriding{
    public void show()throws ArithmeticException {
    }
    public static void main(String[] args) {
    }
}

//if parent class declare no exception then child can declare unchecked exception
//if parent class declare exception then child class declare same exception
//if parent class declare exception then child class declare child exception