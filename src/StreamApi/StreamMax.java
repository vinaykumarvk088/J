package StreamApi;

import java.util.List;

public class StreamMax {
    public static void main(String[] args) {
        List<Integer> n = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //   converting Integer Objects to int and finding the maximum value
        int max = n.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("Maximum number is = " + max);

        //   using reduce method
        n.stream().reduce(Integer::max).ifPresentOrElse(System.out::println, () -> System.out.println("No maximum value found"));

            //or
         n.stream().reduce(Integer::max).ifPresent(System.out::println);
    }
}