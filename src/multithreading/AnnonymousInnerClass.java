package multithreading;

public class AnnonymousInnerClass{
    public static void main(String[] args) {

        AnnonymousInnerClass obj = new AnnonymousInnerClass();

        MyInterface myInterface = new MyInterface() {
            @Override
            public void show() {
                System.out.println("in show");
            }

        };

        MyInterface myInterface1= ()-> {
            System.out.println("in show");
        };
    }
}

interface MyInterface{

    void show();

}

