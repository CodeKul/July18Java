package exceptionhandling;

import java.io.FileOutputStream;

//try
//catch
//finally
public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        try {
            int i = 1 / 1;
            System.out.println(i);
            try {
                String str = "5";
                Integer j = Integer.parseInt(str);
                System.out.println(j);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
            String str = null;
            System.out.println(str.toUpperCase());

        } catch (NumberFormatException e) {
            System.out.println("In NumberFormatException"+e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("In ArithmeticException"+e.getMessage());
        } catch (Exception e){
            System.out.println("In Exception"+e.getMessage());
        } finally
        {
            System.out.println("in finally");
        }

        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");

     /*   int i = 1 / 0;
        System.out.println(i); //unchecked

        FileOutputStream obj = new FileOutputStream("test.txt"); //checked
     */
    }
}
