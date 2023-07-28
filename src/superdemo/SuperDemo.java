package superdemo;
//super keyword

//1. it used to refer immediate parent class variable
//2. it used to invoke immediate parent class method
//3. it used to invoke immediate parent class constructor
public class SuperDemo extends Object{
    int i=10;
    public void show(){
        System.out.println("In show");
    }
    public SuperDemo(){
        System.out.println("in super demo const");
    }
    public SuperDemo(int i) {
        super();
        System.out.println("in super demo const parameter");
    }
}
class A extends SuperDemo{
    int i=5;
    public void display(){
        System.out.println(super.i);
        System.out.println(i);
        super.show();
    }
    public A(){
        super(8);
        System.out.println("in A const");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}