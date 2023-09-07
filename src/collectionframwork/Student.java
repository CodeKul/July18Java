package collectionframwork;

import java.util.*;

public class Student {

    int id;
    String name;
    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        Student obj1 = new Student(1, "Ram", "Pune");
        Student obj2 = new Student(2, "Sham", "Pune");
        Student obj3 = new Student(3, "Rahul", "Pune");
        Student obj4 = new Student(4, "Karan", "Pune");
        List<Student> list2 = Arrays.asList(obj1,obj2,obj3,obj4);

        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        Collections.sort(list);


        list.forEach(s -> {
            System.out.println(s.id + " " + s.name + " " + s.address);
        });

        list.forEach(System.out::println);

        for (Student student : list) {
            System.out.println(student.id + " " + student.name + " " + student.address);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).id + " " + list.get(i).name);
        }

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
