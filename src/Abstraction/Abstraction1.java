package Abstraction;

abstract class Ab{
    abstract void method1();
    abstract void method2();
    //abstract class can have concrete methods also
    void method3(){
        System.out.println("Method 2 Root");
    }
}
class Ab1 extends Ab{
    // The child class must implement all abstract methods or else child class also becomes abstract
    @Override
    void method1() {
        System.out.println("Implemented Method 1");
    }
    @Override
    void method3() {
        System.out.println("Overridden Method 3");
    }
    @Override
    void method2() {
        System.out.println("Implemented Method 2");
    }
}
class Ab2 extends Ab{
    @Override
    void method1() {
        System.out.println("Implemented Method 1 in class Ab2");
    }

    @Override
    void method2() {
        System.out.println("Overridden Method 2 in class Ab2");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Ab obj= new Ab1();
        obj.method1();
        obj.method2();
        obj.method3();
        System.out.println("*********************************************");
        Ab obj1= new Ab2();
        obj1.method1();
        obj1.method2();
        obj1.method3();
    }
}
