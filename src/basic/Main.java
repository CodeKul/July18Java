package basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    static int i = 0;


    String tv;//instance variable// global variable


    public String getName(){//local variable
        String fan;
        String ac;
        return "Hii";
    }

    public Main() {
    }
    Main obj;
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {

        System.out.println(args[0]);

        Main obj = new Main();

        Main obj1 = Main.class.newInstance();
        System.out.println(obj1.tv);

        Constructor<Main> obj2 = Main.class.getConstructor();
        Main obj3 = obj2.newInstance();
        System.out.println(obj3.tv);


        Main obj4 = (Main) obj.clone();

        System.out.println(i);
//        getName();
        System.out.println("Hello world!");

    }

}