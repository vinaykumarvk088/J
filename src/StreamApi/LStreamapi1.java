package StreamApi;

import java.util.ArrayList;
import java.util.List;

class Even{
    int sum(List<Integer> nums){
        return nums.stream().filter(n->n%2==0).reduce(0, Integer::sum);
    }
    int multi(List<Integer> nums){
        return nums.stream().filter(i -> i%2==0).map(i ->i*2).forEach;
    }

}
public class LStreamapi1 {
    static void main(String[] args) {
        List<Integer> nums=List.of(1,3,5,6,7,9,10,12);

    }
}
