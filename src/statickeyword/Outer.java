package statickeyword;

public class Outer {

    int i =10; //member variable

    public static void show(){ //member function
        System.out.println("In show");
    }
    static class Inner{ // member class
        int i=20;
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.i);

//        Inner inner = new Outer().new Inner();

//        System.out.println(inner.i);

        Outer.show();

        Outer.Inner inner = new Inner();
        System.out.println(inner.i);
    }
}
