package java8;

import java.util.Arrays;
import java.util.List;

public class MethodRefArbitoryObject {

    //method ref to arbitrary object of perticuler type
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee("Ashish"),new Employee("Sahil"));

        list.forEach(Employee::getName);

    }

    static class Employee{

        String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            System.out.println("name=>"+name);
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
