package Multithreading;
/*
->single run method for multiple threads
*/

import java.util.Scanner;

class A implements Runnable {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    @Override
    public void run() {
        String threadName=Thread.currentThread().getName();
        if(threadName.equals("add")){
            add();
        }
        else if(threadName.equals("sub")){
            sub();
        }
        else{
            multi();
        }
    }
    public void add(){
        int c= a+b;
        System.out.println("Addition of "+a+", "+b+" is "+c);
    }
    public void sub() {
        int c = a - b;
        System.out.println("subtraction of " + a + ", " + b + " is " + c);
    }
    public void multi() {
        int c = a * b;
        System.out.println("Multiplication of " + a + ", " + b + " is " + c);
    }
}

public class LaunchThead3 {
    static void main() {
        A ob = new A();
        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob);
        Thread t3 = new Thread(ob);

        t1.setName("add");
        t2.setName("sub");
        t3.setName("multi");

        t1.start();
        t2.start();
        t3.start();
    }
}
