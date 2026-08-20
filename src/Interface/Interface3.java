package Interface;




interface I11 {
    void m();

    //    default void l(){
//        System.out.println("default method of I1 interface ");
//    }
}
interface I22 {
    void n();

//    default void l() {
//        System.out.println("default method of I2 interface ");
//    }
}
class Ccc implements I11,I22{
    public void m() {
        System.out.println("implemented m method");
    }

    public void n() {
        System.out.println("implemented n method");
    }
//        public void l(){
//            System.out.println("implemented default method");  //if two interfaces has same method the default method should be implemented
//    }
}

public class Interface3 {
    static void main(String[] args) {
        Ccc t = new Ccc();
        t.m();
    }
}
