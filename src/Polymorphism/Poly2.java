package Polymorphism;

class One1{
    void one(){
        System.out.println("one method");
    }
    void one1(One1 ob){
        ob.one();
    }
}
class Two1 extends One1{
    void one(){
        System.out.println("two method");
    }
}
class Three1 extends Two1{
    void one(){
        System.out.println("three method");
    }
}

public class Poly2 {
    public static void main(String[] args) {
        One1 ob=new One1();
        ob.one();
        ob.one1(new Two1());
        ob.one1(new Three1());
    }
}
