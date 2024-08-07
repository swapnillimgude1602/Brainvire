package Java8.StreamsApi;

import java.util.List;
import java.util.stream.Collectors;

public class filteringeven {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list1 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        // for (Integer integer : list1) {
        // System.out.println(integer);
        // }
        System.out.println(list1);
    }
}
