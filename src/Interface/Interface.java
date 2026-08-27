package Interface;

interface II{
    default void q(){
        System.out.println("interface II default method");
        p();                                         // to use like this for handy situations
        r();
    }
    //these methods cannot override
    static void p(){                                         // for internal use case
        System.out.println("interface static method");
    }
    private void r(){                                        // for internal use case
        System.out.println("interface private method");
    }
}
interface IA extends II{
    int x=1;    //public final static int x=1
    void a();
    String b();
}
interface  IB extends IA{
    void c();
    String d();
    default void q() {
        System.out.println("interface IB default method"); // default method of II is acting as implemented by IB default method
    }
}
class CA implements IB{

   public void c(){
        System.out.println("Overridden IB interface method");
    }
   public String d(){
        return "Overridden IB interface method";
    }
   public void a(){
        System.out.println("Overridden IA interface method");
    }
    public String b(){
       return "Overridden IA interface method";
    }
    static int a(int a, int b){
        int c=a+b;
        return c;
    }
}
class CB extends CA {
//    public void c(){
//        System.out.println("Overridden IB interface method");
//    }
//    public String d(){
//        return "Overridden IB interface method";
//    }
//    public void a(){
//        System.out.println("Overridden IA interface method");
//    }
//    public String b(){
//        return "Overridden IA interface method";
//    }
//    static int a(int a, int b){
//        int c=a+b;
//        return c;
//    }
}
public class Interface {
    static void main(String[] args) {
//      IA ob1 = new IA(); // can not Create an Object to the interface
        CA ob = new CA();
        ob.a();
        ob.q(); // default method can be inherited but its optional to override
        System.out.println(ob.b());
        ob.c();
        System.out.println(ob.d());
        System.out.println(CA.a(10,10));
        II ob1 =new CA();
        ob1.q();
        II ob2=new CB();
        ob2.q();

    }
}
