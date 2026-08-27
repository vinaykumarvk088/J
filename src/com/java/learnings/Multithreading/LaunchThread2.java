package Multithreading;


import java.util.Scanner;

class Alpha extends Thread
{
    public void registration()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your id");
        int id=sc.nextInt();
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("id :"+id +" age :" +age);
        sc.close();
    }

    @Override
    public void run()
    {
        registration();
    }

}

class Beta extends Thread
{
    public void courseInfo()
    {
        for(int i=0;i<5; i++)
        {
            System.out.println("Visit telusko.com for more courses");
            try
            {
                Thread.sleep(5000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void run()
    {
        courseInfo();
    }
}
class Gamma extends Thread
{
    public void printingStars()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("* ");
            try
            {
                Thread.sleep(5000);
            }
            catch (InterruptedException e)
            {

                e.printStackTrace();
            }
        }
    }
    @Override
    public void run()
    {
        printingStars();
    }
}
public class LaunchThread2
{
    static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread started");
        Alpha a=new Alpha();//new Thread
        Beta b=new Beta();//new Thread
        Gamma g=new Gamma();//new Thread   3 + 1 ==> 4

        a.start();
        b.start();
        g.start();
        a.join();
        b.join();  //We use join() method when the main thread needed to wait until all the remaining threads should be executed.
        g.join();
//		a.registration();
//		b.courseInfo();
//		g.printingStars();
        System.out.println("Main thread done with work");
    }

}