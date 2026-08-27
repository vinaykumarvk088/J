package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class Two{
    Scanner sc=new Scanner(System.in);
    void div() {
        try{
            int numerator = sc.nextInt();
            int denominator = sc.nextInt();
            int result = numerator / denominator;
            System.out.println("The result is = " + result);
            try {
                int[] ar = new int[sc.nextInt()];
                System.out.println("enter the index of the array to insert the data");
                int index = sc.nextInt();
                System.out.println("Enter the data");
                ar[index] = sc.nextInt();
                System.out.println(ar[index]);
//            for(int index:ar){
//                ar[index]=sc.nextInt();
//            }
            } catch(IndexOutOfBoundsException i){
                System.out.println("Please enter valid array index");
            }
            catch(InputMismatchException m){
                System.out.println("Please enter the valid inputs");
            }
        }
        catch(ArithmeticException a){
            System.out.println("Please use real numbers");
        }
//        catch(Exception e){
//            System.out.println("Something is not right");
//        }
    }
}
public class Eh3 {
    static void main(String[] args) {
        Two ob1=new Two();
        ob1.div();


    }
}