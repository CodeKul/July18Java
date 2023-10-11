package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * stream api - it is sequence of object that have many methods
 *              and we combine that methods to produce desire
 *              result.
 *
 * types - sequential and parallel (multithreading)
 *
 * operation - terminal and intermediate
 *
 * terminal  - forEach(Consumer),reduce(),collect()
 *
 * intermediate - map(Function),filter(Predicate),sorted()
 *
 *
 */

public class StreamApi {

    public static void main(String[] args) {

        Function<String,Integer>function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(function.apply("Welcome"));

        Function<Integer,Integer> add = (a)->10+a;
//        System.out.println(add.apply(10));

        Function<Integer,Integer> multi = (m)->m*2;
//        System.out.println(multi.apply(2));

        Function<Integer,Integer> a  = add.andThen(multi);
        System.out.println(a.apply(10));//40

        Function<Integer,Integer> c  = add.compose(multi);
        System.out.println(c.apply(10));//30

        Function<Integer,Integer>i  = Function.identity();
        System.out.println(i.apply(10));

        List<Integer> list = Arrays.asList(1,10,1012,23);

        Function<Integer,Integer> addNumbers = (s)->s+10;

        System.out.println(list.stream().map(addNumbers).collect(Collectors.toList()));

        System.out.println(IntStream.of(1,10,1012,23).max().getAsInt());

        Predicate<Integer> predicate = p->p>0;
        System.out.println(predicate.test(2));

        Predicate<Integer> predicate1 = p->p%2==0;

        list.stream().filter(predicate1).map(add).forEach(System.out::println);

    }
}
