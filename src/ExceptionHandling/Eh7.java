package ExceptionHandling;

import java.util.Scanner;

class UnderAgeException extends RuntimeException{
    UnderAgeException(String msg){
        super(msg);
    }
}
class OverAgeException extends RuntimeException{
    OverAgeException(String msg){
        super(msg);
    }
}



class Applicant{
    Scanner sc=new Scanner(System.in);
    private int age;
    void inputs(){
        System.out.println("Please enter the age of the passenger");
        age=sc.nextInt();
    }
    void booking(){
        if(age>=18 && age<=70){
            System.out.println("Proceed with the booking the ticket");
        }
        else if (age<18){
//            System.out.println("The passenger is under aged, can't allowed to travel");
            throw new UnderAgeException("The passenger is under aged, can't allowed to travel");
        }
        else {
//            System.out.println("The passenger is over aged, can't allowed to travel");
            throw new OverAgeException("The passenger is over aged, can't allowed to travel");
        }
    }

}
class RTO {
    Applicant ob = new Applicant();

    String initiate() {
        try {
            ob.inputs();
            ob.booking();
        } catch (UnderAgeException | OverAgeException exc) {
            System.out.println(exc.getMessage());
            try {
                ob.inputs();
                ob.booking();
            } catch (UnderAgeException | OverAgeException ex) {
                System.out.println(ex.getMessage());
                try {
                    ob.inputs();
                    ob.booking();
                } catch (UnderAgeException | OverAgeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return "Booking Application terminated";
    }
}

public class Eh7 {
    static void main(String[] args) {
        RTO obj=new RTO();
        System.out.println(obj.initiate());
    }
}
