package statickeyword;

public class Employee {

    int id;
    String name;
    static String companyName;

    static {
        companyName ="ABC";
        System.out.println("In static block");
    }
   public  final Double PI = 3.142;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static void show(){
        System.out.println("in show");
    }
    public static void main(String[] args) {

        Employee obj1 = new Employee(1,"Rahul");
        Employee obj2 = new Employee(2,"Ranjeet");
        Employee obj3 = new Employee(3,"Suhas");

        System.out.println(obj1.id+" "+obj1.name+" "+companyName);
        System.out.println(obj2.id+" "+obj2.name+" "+companyName);
        System.out.println(obj3.id+" "+obj3.name+" "+companyName);

        show();

    }
}
