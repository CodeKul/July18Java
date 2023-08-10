package exceptionhandling;

import java.sql.SQLException;

public class ExceptionPropogation {

    public void a(){
//        int i=10/0;
        try {
            throw new SQLException("Sql exc");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void b(){
        try {
            a();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void c(){
            b();
    }

    public static void main(String[] args) {
        ExceptionPropogation obj = new ExceptionPropogation();
        obj.c();

        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
    }
}
