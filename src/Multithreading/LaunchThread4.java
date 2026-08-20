package Multithreading;
//Synchronized methods


class Ab implements Runnable{

    @Override
    synchronized public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" is started");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" is working");
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName()+" is finished");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
public class LaunchThread4 {
    static void main() {
        Ab ob = new Ab();
        Thread th1 = new Thread(ob);
        Thread th2 = new Thread(ob);
        Thread th3 = new Thread(ob);
//        Thread th1 = new Thread(new Ab());
//        Thread th2 = new Thread(new Ab());// ->(Object level locking) we should only give one runnable instance(OBJECT) for all threads in synchronized methods
//        Thread th3 = new Thread(new Ab());//-> if given threads had it's own runnable instances then they act non-synchronized even in synchronized methods
        th1.setName("threadOne");
        th2.setName("threadTwo");
        th3.setName("threadThree");
        th1.start();
        th2.start();
        th3.start();
    }
}
