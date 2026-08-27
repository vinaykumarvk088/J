package LamdaExpression;

//Functional Interface (only one Abstract method should be there)
public interface Lamda1 {
    String lamda(String name);
    default void lamda1(){
        System.out.println("VINAYKUAMR DEFAULT");
    }  //default method
}
class demo implements Lamda1{
    public String lamda(String name){
        return name;
    }
}
class A {
    static void main(String[] args) {
        demo ob = new demo();
        System.out.println(ob.lamda("VINAYKUMAR"));
        //Instantiating anonymous inner class(Nameless class) directly when creating an Object of that class-
        //-that implements the interface
        Lamda1 ob1 = new Lamda1() {
            public String lamda(String name) {
                return name;
            }
        };
        System.out.println(ob1.lamda("Vinaykumar"));
        System.out.println("***************************************");
        //Lamda Expression
        Lamda1 ob2 =name -> name;
        System.out.println(ob2.lamda("VinayKumar"));
    }
}
