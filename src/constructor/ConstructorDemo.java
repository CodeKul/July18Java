package constructor;

import statickeyword.Employee;

/**
 * constructor -> it is special of function which invoke automatically
 *                  when you create object of class
 *
 * Rules to create constructor -
 *      1. Your class name should be your constructor name
 *      2. their should not be explicit return type
 *      3. synchronized,final,static keyword are not allowed
 *
 *   Types -
 *        1.Default
 *        2.Parameter
 *
 *   advantage - it initialise variables to their default value
 */
public class ConstructorDemo {


    int id;
    String name;
    String address;

    public ConstructorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ConstructorDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public ConstructorDemo(){
        System.out.println("In const");
    }

    public ConstructorDemo(int i){
        System.out.println("In parameter constructor");
    }

    public static void main(String[] args) {

//        ConstructorDemo obj = new ConstructorDemo();
//        System.out.println(obj);
//
        ConstructorDemo obj1 = new ConstructorDemo(1,"Rahul","Pune");

        System.out.println(obj1);

//        ConstructorDemo1 obj = new ConstructorDemo1();
//        Employee employee= new Employee();
//        employee.PI =3.20;

        Employee.show();

    }
}
