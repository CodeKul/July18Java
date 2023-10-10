package java8;

public class MethodRefToConstructor {
    public MethodRefToConstructor() {
        System.out.println("In constructor");
    }

    public static void main(String[] args) {
        //refer
        MyInterface4 myInterface4 = MethodRefToConstructor::new;
        myInterface4.getCon();
    }
}

interface MyInterface4{
    MethodRefToConstructor getCon();

}
