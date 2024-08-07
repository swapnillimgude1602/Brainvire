package Java8.StreamsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //  makes empty stream
        Stream<Object> empStream = Stream.empty();
        System.out.println(empStream);
        //  array, object, collection
        String names[] = { "swap", "abhi", "vishal", "pritesh" };
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        //  BuilderPattern
        //  Arrays
        IntStream stream = Arrays.stream(new int[]{1,2,4,5,5});
        stream.forEach(i->{
            System.out.println(i);
        });

        //  List
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(11);
        list1.add(111);
        list1.add(1111);

        Stream<Integer> stream3 = list1.stream();
        stream3.forEach(i->{
            System.out.println(i);
        });



    }
}
