package Interface;



interface I1 {
    void m();

        default void l(){
        System.out.println("default method of I1 interface ");
    }
}
interface I2 {
    void n();

    default void l() {
        System.out.println("default method of I2 interface ");
    }
}
class Cc implements I1, I2 {
        public void m() {
            System.out.println("implemented m method");
        }

        public void n() {
            System.out.println("implemented n method");
        }
        public void l(){
            System.out.println("implemented default method");  //if two interfaces has same method the default (any method) method should be implemented
    }
    }

    public class Interface2 {
        static void main(String[] args) {
            Cc t = new Cc();
            t.m();
            t.n();
            t.l();
        }

    }
