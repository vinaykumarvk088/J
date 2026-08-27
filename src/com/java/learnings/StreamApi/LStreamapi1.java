package StreamApi;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Num{
    int sum(List<Integer> nums){
        return nums.stream().filter(n->n%2==0).reduce(0, Integer::sum);
    }
    int multiSum(List<Integer> nums){
        return nums.stream().filter(i -> i%2==0).map(i ->i*2).reduce(0, Integer::sum);
    }
    int max(List<Integer> nums){
        return nums.stream().filter(i -> i%2==0).reduce(Integer::max).get();
    }
    int min(List<Integer> nums){
        return nums.stream().filter(i -> i%2==0).reduce(Integer::min).get();
    }
    List<Integer> Evennums(List<Integer> nums){
        return nums.stream().filter(i -> i%2==0).collect(Collectors.toList());
    }
    

}
public class LStreamapi1 {
    public static void main(String[] args) {
        List<Integer> nums=List.of(1,2,3,5,6,7,9,10,12);
        Num e=new Num();
        System.out.println("Sum of numbers = "+e.sum(nums));
        System.out.println("Product of numbers = "+e.multiSum(nums));
        System.out.println("Maximum of number = "+e.max(nums));
        System.out.println("Minimum of number = "+e.min(nums));



    }
}
