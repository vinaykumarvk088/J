package Inheritance;

class Demo1{
    int a,b;
    Demo1(){
        System.out.println("1Constructor with zero params");
    }
    Demo1(int a,int b){
        this();
        this.a=a;
        this.b=b;
        System.out.println("1Constructor with two params");
    }
    Demo1(int a){
        this(5,6);
        this.a=a;
        System.out.println("1Constructor with three params");
    }
}
class Demo2 extends Demo1{
    int x,y;
    Demo2(){
        super(3);
        System.out.println("2Constructor with zero params");
    }
    Demo2(int x,int y){
        this();
        this.x=x;
        this.y=y;
        System.out.println("2Constructor with two params");
    }
    Demo2(int x){
        this(7,8);
        this.x=x;
        System.out.println("1Constructor with three params");
    }
    void meth(){
        System.out.println(" x = "+x);
        System.out.println(" y = "+y);
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);
    }
}
public class Inheritance3{
    static void main(String[] args) {
        Demo1 ob=new Demo2(1);
        ((Demo2)ob).meth();
    }
}