package collectionframwork;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class StudentDemo {

    int id;
    String name;
    String address;

    public StudentDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDemo that = (StudentDemo) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {

        StudentDemo obj1 = new StudentDemo(1,"Akash","Pune");
        StudentDemo obj2 = new StudentDemo(1,"Akash","Pune");
        StudentDemo obj3 = new StudentDemo(2,"Rahul","Pune");

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        Set<StudentDemo> set = new HashSet<>();
        set.add(obj1);
        set.add(obj2);
        set.add(obj3);


        if(obj1.hashCode()==obj2.hashCode()){
            if(obj1.equals(obj2)){
                System.out.println("object are equal");
            }
            else {
                System.out.println("objects are not equal");
            }
        }else {
            System.out.println("objects are not equal");
        }

//        System.out.println(set);


//        System.out.println(new Integer(10) == new Integer(10));

        System.out.println(Integer.valueOf(5) == Integer.valueOf(5));
        System.out.println(Integer.valueOf(128) == Integer.valueOf(128));

        System.out.println(Integer.valueOf(128).equals(Integer.valueOf(128)));
    }
}
