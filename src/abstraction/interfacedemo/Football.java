package abstraction.interfacedemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Football implements Sports,Gym{
    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void exercise() {

    }

  

    public static void main(String[] args) {

        List<Integer> list =  new ArrayList<>();
        list.add(10);

        List<Integer> list1 = new LinkedList<>();
        list1.add(10);

        Football obj = new Football();
        obj.play();
    }

    @Override
    public void weight() {

    }
}
