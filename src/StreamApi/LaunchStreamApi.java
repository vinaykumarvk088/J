package StreamApi;
//StreamApi are used to interact with data-structures without modifying them-
//-by using stream pipelines for data manipulation without messy for loop and its temp-
//-reference variables.
//It does not change original data.(Immutability)

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class LaunchStreamApi {
    static void main() {
        List<Integer> nums= List.of(5,4,8,6,13,15,10,12);
//        Predicate<Integer> pd=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {   // Predicate interface is a functional interface-
//                return n%2==1;                 //-so we can write it in lamda expression
//            }
//        };
//        Stream<Integer> stream=nums.stream();
// //Intermediate Operator
//        Stream<Integer> Oddnum =stream.filter(i -> i%2==1);
// //Terminal Operator
//        //Oddnum.forEach(System.out::println);    //using method reference for lambda expression
//        Stream<Integer> DoubleOddnum=Oddnum.map(i -> i*2);
//        int Total=DoubleOddnum.reduce(0,(a,b)->a+b);
//        System.out.println(Total);
        // or
        Stream<Integer> stream=nums.stream().filter(i->i%2==1).map(i->i*2);
        int Total=stream.reduce(0,(c,e)->c+e);
        System.out.println(Total);
    }
}
