package Polymorphism;
//Polymorphism only works when multiple child classes overrides one parent class methods(multi level inheritance)
class One{
    void x(){
        System.out.println("One class x method");
    }
    void y(){
        System.out.println("One class y method");
    }
    void z(One s){
        s.x();
        s.y();
    }
}
class Two extends One{
    void x(){
        System.out.println("Two class x method override One method");
    }
    void y(){
        System.out.println("Two class y method override One method");
    }
}
class Three extends One{
    void x(){
        System.out.println("Three class x method override One method");
    }
    void y(){
        System.out.println("Three class y method override One method");
    }
}
class Four extends One{
    void x(){
        System.out.println("Four class x method override One method");
    }
    void y(){
        System.out.println("Four class y method override One method");
    }
}
public class Polymorphism{
    public static void main(String[] args) {
        Two p=new Two();
        Three q=new Three();
        Four r=new Four();
//        One s;

//        p.x();
//        p.y();
//        q.x();
//        q.y();
//        r.x();
//        r.y();

//        s=p;
//        s.x();
//        s.y();
//        System.out.println("************************************************");
//        s=q;
//        s.x();
//        s.y();
//        System.out.println("************************************************");
//        s=r;
//        s.x();
//        s.y();
//        System.out.println("************************************************");
//Polymorphism
        One s=new One();
        s.z(p);
        s.z(q);
        s.z(r);
        s.z(s); //We can use same Object reference as parameter to call that same class Method
    }
}
