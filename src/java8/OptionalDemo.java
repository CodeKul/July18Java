package java8;

import java.util.Optional;

//optional keyword is used to handle null pointer exception
//if constructor is private then we dont create object of class
public class OptionalDemo {

    public static void main(String[] args) {

        Student student = new Student(1,null);

        if(student.getName() != null){
            System.out.println(student.getName().toUpperCase());
        }else {
            System.out.println("name is null");
        }

//        Optional<String> optional = Optional.empty();
//        System.out.println(optional);

//        Optional<String> optional1 = Optional.of(student.getName());
////        if(optional1.isPresent()){
//            System.out.println(optional1.get());
////        }

        Optional<String> optional2 = Optional.ofNullable(student.getName());
        System.out.println(optional2);
//        if(optional2.isPresent()){
//        }
    }

}

class Student{

   private int id;
   private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
