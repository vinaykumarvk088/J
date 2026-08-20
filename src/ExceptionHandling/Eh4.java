package ExceptionHandling;

import java.util.Scanner;

class Three{
    Scanner sc=new Scanner(System.in);
    void div(){
        int numerator=sc.nextInt();
        int denominator=sc.nextInt();
        try {
            float result = (float) numerator / denominator;
            System.out.println("The result will be " + result);
        }
        catch (ArithmeticException a){
            System.out.println("Please enter real numbers");
        }
        // we use finally block to manually close resources (like scanner class etc...)
        finally{
            System.out.println("div method terminated");
            sc.close();
        }
    }

}


public class Eh4 {
    static void main(String[] args) {
        Three ob=new Three();
        ob.div();
    }
}
