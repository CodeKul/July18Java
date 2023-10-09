package java8;

public class LambadaExpression {
    public static void main(String[] args) {

        MyInterface myInterface = ()-> {
            System.out.println("in show");
        };

        MyInterface1 myInterface1 = (a,b)-> a+b;
    }
}

interface MyInterface{
    void show();
}


interface MyInterface1{

    int add(int i,int j);
}