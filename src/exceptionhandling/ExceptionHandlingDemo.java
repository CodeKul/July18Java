package exceptionhandling;

//try
//catch
//finally
public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        try {
            int i = 1 / 0;
            System.out.println(i);

            try {
                String str = "5";
                Integer j = Integer.parseInt(str);
                System.out.println(j);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }

        } catch (NumberFormatException | ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");

    }
}
