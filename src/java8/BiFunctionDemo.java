package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,10,1012,23);

        Predicate<Integer> predicate1 = p->p%2==0;
        BiFunction<List<Integer>, Predicate<Integer>,List<Integer>> biFunction = new BiFunction<List<Integer>, Predicate<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> integers, Predicate<Integer> integerPredicate) {
                List<Integer> list = new ArrayList<>();

                for (Integer i :integers){
                    if(integerPredicate.test(i)){
                        list.add(i);
                    }
                }
                return list;
            }
        };
        System.out.println(biFunction.apply(Arrays.asList(1,10,1012,23),predicate1));
    }
}
