package StreamApi;

import java.util.List;
//import java.util.Objects;
// import java.util.Optional;

public class StreamsMin {
    public static void main(String[] args) {
        List<Integer> n = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //   converting Integer Objects to int abd

        // int min=n.stream().mapToInt(Integer::intValue).min().getAsInt();
        // System.out.println("Minimum number is = "+min);

        //   using reduce method
        n.stream().reduce(Integer::min).ifPresent(System.out::println);
         //print or println methods autounbox the Integer object to int and print it
    }
}
