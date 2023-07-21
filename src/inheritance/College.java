package inheritance;

public class College {//parent class,super class, base class

    int id;
    String name;
    String address;

    public static void main(String[] args) {

        College obj = new College();
        obj.id =1;
        obj.name ="ABC";
        obj.address="pune";

        System.out.println(obj.id+" "+ obj.name+" "+obj.address);
    }
}

class Student extends College{//child class,sub class,derived class

    int id;
    String name;
    String address;

    public void show(){
        System.out.println("in student show");
    }

    public static void main(String[] args) {

        Student obj = new Student();
        obj.show();
        obj.id =1;
        obj.name ="Rahul";
        obj.address="pune";

        System.out.println(obj.id+" "+ obj.name+" "+obj.address);
    }

}

class Teacher extends College{
    public static void main(String[] args) {

        Teacher obj = new Teacher();
        obj.id =1;
        obj.name ="Raju";
        obj.address="pune";

        System.out.println(obj.id+" "+ obj.name+" "+obj.address);
    }
}