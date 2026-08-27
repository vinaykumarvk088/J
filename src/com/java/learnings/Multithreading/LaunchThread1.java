package Multithreading;
/*
->We can achive multithreading by extending predefind Thread class (or) Implementing runnable interface
->By default thread class implements runnable interface
->Once Thread created we should be able to start it by Start method(it executes run method)
->We should always give thread activity in the run method only.
->We can implement single run method for multiple threads or each one
-> Synchronized methods can allow only one thread at a time to execute.
*/


class A1 extends Thread{
    public void one(){
        System.out.println("A1 class - method one");
        try {
            Thread.sleep(5000);
            System.out.println("A1");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void run(){
        one();
    }
}
class A2 extends Thread{
    public void two(){
        System.out.println("A2 class - method two");
        try {
            Thread.sleep(5000);
            System.out.println("A2");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void run(){
        two();
    }
}
class A3 extends Thread{
    public void three(){
        System.out.println("A3 class - method three");
        try {
            Thread.sleep(5000);
            System.out.println("A3");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void run(){
        three();
    }
}

public class LaunchThread1 {
    static void main() {
        A1 ob1 = new A1();
        A2 ob2 = new A2();
        A3 ob3 = new A3();

        ob1.start();
        ob2.start();
        ob3.start();


//        Thread th1 = new Thread(new A1());
//        Thread th2 = new Thread(new A2());
//        Thread th3 = new Thread(new A3());
//        th1.start();
//        th2.start();
//        th3.start();
    }
}
