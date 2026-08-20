package Super;

class Alpha{
    int a;
    void meth1(){
        a=6;
        System.out.println("Parent class method");
        System.out.println(a);
    }
}
class Beta extends Alpha{
    int a;
    void meth1(){
         a=7;
        System.out.println("Child class method");
        System.out.println(a);
    }
    void show(){
       super.meth1();
       this.meth1();
    }
}
public class SuperKeyWord {
    static void main(String[] args) {
        Beta ob=new Beta();
        ob.show();
    }
}
