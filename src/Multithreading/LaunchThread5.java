package Multithreading;



class Books implements Runnable{
   final String B1= "JAVA";
   final String B2= "SPRING";
   final String B3= "DEVOPS";
    public void run(){
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("RAVI")){
            try {
                synchronized(B1) {
                    System.out.println("RAVI has acquired the JAVA Book");
                    Thread.sleep(5000);
                    synchronized (B2) {
                        System.out.println("RAVI has acquired the SPRING Book");
                        Thread.sleep(5000);
                        synchronized (B3) {
                            System.out.println("RAVI has acquired the DEVOPS Book");
                            Thread.sleep(5000);
                        }
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else if (threadName.equals("THARUN") ) {
            try {
                synchronized(B1) {
                    System.out.println("THARUN has acquired the JAVA Book");
                    Thread.sleep(5000);
                    synchronized (B2) {
                        System.out.println("THARUN has acquired the SPRING Book");
                        Thread.sleep(5000);
                        synchronized (B3) {
                            System.out.println("THARUN has acquired the DEVOPS Book");
                            Thread.sleep(5000);
                        }
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else{
            try {
                synchronized(B1) {
                    System.out.println("VINAY has acquired the JAVA Book");
                    Thread.sleep(5000);
                    synchronized (B2) {
                        System.out.println("VINAY has acquired the SPRING Book");
                        Thread.sleep(5000);
                        synchronized (B3) {
                            System.out.println("VINAY has acquired the DEVOPS Book");
                            Thread.sleep(5000);
                        }
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class LaunchThread5 {
    static void main() {
        Books ob = new Books();
        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob);
        Thread t3 = new Thread(ob);
        t1.setName("VINAY");
        t2.setName("RAVI");
        t3.setName("THARUN");
        t1.start();
        t2.start();
        t3.start();
    }
}
