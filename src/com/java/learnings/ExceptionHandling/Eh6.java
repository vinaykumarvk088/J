package ExceptionHandling;
import java.util.Scanner;

class InvalidCustomerException extends Exception{

}

class Atm{
    Scanner sc=new Scanner(System.in);
    private int ano=12345;
    private int apw=1502;
    private int acn ;
    private int pw;
    public void inputs() {
        acn = sc.nextInt();
        pw = sc.nextInt();
    }
    public void verify() throws InvalidCustomerException{
        if (acn==ano && pw==apw) {
            System.out.println("Please collect your cash");
            sc.close();
        }
        else{
            System.out.println("Invalid credential");
            throw new InvalidCustomerException();
        }
    }

}
public class Eh6 {
    static void main(String[] args) {
        Atm ob=new Atm();
        try {
            ob.inputs();
            ob.verify();
        }
        catch(InvalidCustomerException ice){
            System.out.println("Please enter valid credentials");
            try{
                ob.inputs();
                ob.verify();
            }
            catch(InvalidCustomerException ie){
                System.out.println("Please enter valid credentials");
                try{
                    ob.inputs();
                    ob.verify();
                }
                catch(InvalidCustomerException e){
                    System.out.println("Suspicious activity detected");
                }
            }
        }
        System.out.println("Bank application is terminated");
    }
}
