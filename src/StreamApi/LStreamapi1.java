package StreamApi;

import java.util.ArrayList;
import java.util.List;

class Even{
    int sum(List<Integer> nums){
        return nums.stream().filter(n->n%2==0).reduce(0, Integer::sum);
    }
    int multi(List<Integer> nums){
        return nums.stream().filter(i -> i%2==0).map(i ->i*2).reduce(0, Integer::sum);
    }
    int max(List<Integer> nums){
        return nums.stream().filter(i -> i%2==0).reduce(0, Integer::max);
    }
    int min(List<Integer> nums){
        return nums.stream().filter(i -> i%2==0).reduce(0, Integer::min);
    }

}
public class LStreamapi1 {
    public static void main(String[] args) {
        List<Integer> nums=List.of(1,2,3,5,6,7,9,10,12);
        Even e=new Even();
        System.out.println("Sum of even numbers = "+e.sum(nums));
        System.out.println("Product of even numbers = "+e.multi(nums));
        System.out.println("Maximum of even number = "+e.max(nums));
        System.out.println("Minimum of even number = "+e.min(nums));
    }
}
