package StaticIntanceBlocks;


class Demo{
    static int a;
    int b;
    static{
        System.out.println(a);
        System.out.println("Static Block");
    }
    {
        System.out.println(b);
        System.out.println("Instance Block(Non Static Block)");
        b=2;
    }
    static void me(){
        a=1;
        System.out.println("Static Method");
    }
}
public class ExecutionState{
    static void main(String[] args) {
        System.out.println("Main Method");
        Demo N=new Demo();
        // Demo n=new Demo();
        Demo.me();
        System.out.println(Demo.a);
        System.out.println(N.b);
    }
}
