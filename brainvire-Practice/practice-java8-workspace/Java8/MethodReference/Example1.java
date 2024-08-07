package Java8.MethodReference;

import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
 List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list1 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(Integer::list1);
 
    }
}
