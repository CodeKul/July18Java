package polymorphism;

import inheritance.College;

/**
 * Polymorphism - The ability to take one to many form
 * or
 * One thing have many actions

 * Method Overloading - class have same method name with different number of arguments

 * 1. by changing return type
 * 2. by changing number of arguments
 */

public class PolymorphismDemo {

    public static void main(String[] args) {

        PolymorphismDemo obj = new PolymorphismDemo();
        obj.add(4,9.0);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(int a, double g) {
        return a + g;
    }

    public College getCollege() {
        return new College();
    }
}
