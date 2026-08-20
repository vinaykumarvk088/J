package ExceptionHandling;

import java.util.Scanner;

class Four{
    Scanner sc=new Scanner(System.in);
    void div(){
        int numerator=sc.nextInt();
        int denominator=sc.nextInt();
        if(denominator>0) {
            int result = numerator / denominator;
            System.out.println("The result will be " + result);
        }
        else{
            throw new ArithmeticException();
        }
    }

}
public class Eh5{
    static void main(String[] args) {
        Four ob=new Four();
        try {
            ob.div();
        }
        catch(ArithmeticException a){
            System.out.println("Please enter real numbers");
            try {
                ob.div();
            }
            catch (ArithmeticException ae){
                System.out.println("div method is terminated");
            }
        }
        System.out.println("Main method is terminated");
    }
}
