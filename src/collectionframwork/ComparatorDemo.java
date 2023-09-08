package collectionframwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    int id;
    String name;
    String address;

    public ComparatorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ComparatorDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ComparatorDemo obj1 = new ComparatorDemo(143, "Ram", "Pune");
        ComparatorDemo obj2 = new ComparatorDemo(143, "Sham", "Pune");
        ComparatorDemo obj3 = new ComparatorDemo(34, "Rahul", "Pune");
        ComparatorDemo obj4 = new ComparatorDemo(4234, "Karan", "Pune");
        List<ComparatorDemo> list2 = Arrays.asList(obj1,obj2,obj3,obj4);
        Comparator<ComparatorDemo> comparator = new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                if(o1.id == o2.id){
                    return 0;
                } else if (o1.id > o2.id) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Comparator<ComparatorDemo> comparator1 = new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(list2,comparator.thenComparing(comparator1));

        System.out.println(list2);
    }
}
