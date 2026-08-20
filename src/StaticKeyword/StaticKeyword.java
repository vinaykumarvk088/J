package StaticKeyword;

class A{
    static void a(){
        System.out.println("A class static method a");
    }
}
class B extends A{
    static void a(){
        System.out.println("B class static method a");
    }
    static void b(){
        System.out.println("B class static method b");
    }
}
public class StaticKeyword {
    static void main(String[] args) {
        B ob =new B();
        A.a();
        B.a();
        B.b();
        System.out.println("***************************************************");
        ob.a();
        ob.b();
        System.out.println("***************************************************");
        A ob1=new B();
        ob1.a();//static method a of class A will print because of A class reference
        ((B)ob1).a(); //The overridden static method acts as a specialized method
    }
}
