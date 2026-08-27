package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;


class One{
    Scanner sc=new Scanner(System.in);
    void div() {
        try{
            int nominator = sc.nextInt();
            int denominator = sc.nextInt();
            int result = nominator / denominator;
            System.out.println("The result is = " + result);
            int []ar=new int[sc.nextInt()];
            System.out.println("enter the index if the array to insert the data");
            int index=sc.nextInt();
            System.out.println("Enter the data");
            ar[index]=sc.nextInt();
            System.out.println(ar[index]);
//            for(int index:ar){
//                ar[index]=sc.nextInt();
//            }
        }
        catch(ArithmeticException a){
            System.out.println("Please use real numbers");
        }
        catch(IndexOutOfBoundsException i){
            System.out.println("Please enter valid array index");
        }
        catch(InputMismatchException m){
            System.out.println("Please enter the valid inputs");
        }
        catch(Exception e){
            System.out.println("Something is not right");
        }
    }
}
public class Eh2 {
    static void main(String[] args) {
        One ob1=new One();
        ob1.div();


    }
}
