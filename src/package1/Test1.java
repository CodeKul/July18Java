package package1;

import encapsulation.EncapsulationDemo;

public  class Test1 {

    protected int i = 10; //member variable

    public void show(){ //member function

    }

    private class Test{ //member class

    }
    public static void main(String[] args) {
        Test1 obj = new Test1();
        System.out.println(obj.i);

        EncapsulationDemo obj1 = new EncapsulationDemo();
        obj1.setId(1);
    }
}

//access specifier or access modifier

//public  - we can access variable/function through out the project
//private - we can access variable/function within class only
//default - we can access variable/function within package only
//protected - we can access variable/function within package only and outside the package through inheritance