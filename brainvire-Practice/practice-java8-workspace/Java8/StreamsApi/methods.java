package Java8.StreamsApi;

import java.util.List;
import java.util.stream.Collectors;

/* Filter - works on boolean
    1) takes predicate
    2) its boolean valued function
    */
/* Map - works on element
1) we can perform operation on each element
2) takes function
3) return value
*/
public class methods {
    public static void main(String[] args) {

        // filter
        List<String> str = List.of("swap", "abhi", "vishal", "pritesh");
        str.stream().filter(e -> e.startsWith("a")).forEach(e -> System.out.println(e));

        // map
        List<Integer> list = List.of(1, 12, 2, 11, 3, 4, 5, 6);
        List<Integer> list2 = list.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(list2);

        // Method reference
        str.stream().forEach(System.out::println);

        // sort
        list.stream().sorted().forEach(System.out::print);
        System.out.println();
        //max
        Integer max = list.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("max "+max);
    
        Integer min = list.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("min "+min);
    
    }
}
