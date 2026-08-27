package Inheritance;

class Parent{
    int a,b;
    void demo1(){
        System.out.println("Parent Method1");
    }
    void demo1(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Parent Method2");
    }
}
class Child1 extends Parent{
    void demo2(){
        System.out.println("Child Method1");
    }
    void demo1(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Overridden Parent Method");
    }
}
public class Inheritance1 {
    static void main(String[] args) {
        Child1 ob1=new Child1();
        ob1.demo2();
        ob1.demo1(5,6);

    }
}
