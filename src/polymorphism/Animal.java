package polymorphism;

/**
 * Method overriding - two class have same method with same signature
 *
 */
public class Animal {

    int count;
    public void sound(){
        System.out.println("In animal sound");
    }
}

class Cat extends Animal{

    int count;
   public void sound(){
       System.out.println("cat sound");
   }

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();

    }
}
