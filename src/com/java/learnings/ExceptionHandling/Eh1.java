package ExceptionHandling;
import java.util.Scanner;




public class Eh1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nominator = sc.nextInt();
        int denominator = sc.nextInt();
        try {
            //exception point
            int result = nominator / denominator;
            System.out.println("The division of given integer is" + result);
        }
        catch (ArithmeticException a){
            System.out.println("Please give non zero denominator");
        }
        sc.close();
    }
}
