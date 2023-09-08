package collectionframwork;

import java.util.*;

public class Student implements Comparable<Student> {

    int id;
    String name;
    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Student obj1 = new Student(143, "Ram", "Pune");
        Student obj2 = new Student(23, "Sham", "Pune");
        Student obj3 = new Student(34, "Rahul", "Pune");
        Student obj4 = new Student(4234, "Karan", "Pune");
        List<Student> list2 = Arrays.asList(obj1,obj2,obj3,obj4);

        Collections.sort(list2);

        System.out.println(list2);
//        List<Student> list = new ArrcomparayList<>();
//        list.add(obj1);
//        list.add(obj2);
//        list.add(obj3);
//        list.add(obj4);



//        list.forEach(s -> {
//            System.out.println(s.id + " " + s.name + " " + s.address);
//        });
//
//        list.forEach(System.out::println);
//
//        for (Student student : list) {
//            System.out.println(student.id + " " + student.name + " " + student.address);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).id + " " + list.get(i).name);
//        }
//
//        Iterator<Student> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

//    @Override
//    public int compareTo(Student o) {
//        if(this.id == o.id){
//            return 0;
//        } else if (this.id>o.id) {
//            return 1;
//        }else {
//            return -1;
//        }
//    }
}
