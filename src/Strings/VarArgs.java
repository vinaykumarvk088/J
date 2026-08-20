package Strings;

// Variable Arguments
class String4{
    void num(int...a){ //internally it becomes an array "int[] array ={....};"
        int sum=0;
        for(int k:a){
            sum=sum+k;
        }
        System.out.println(sum);
    }
    int calc(int...a){
        int sum=0;
        for(int data:a){
            sum = sum+data;
        }
        return sum;
    }
}
public class VarArgs{
    static void main(String[] args) {
        String4 ob= new String4();
        ob.num(10,20,30,40,50);
        System.out.println(ob.calc(10,10,10,10));
    }
}
