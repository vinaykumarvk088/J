package Encapsulation;

class Demo1{
    private int id;
    private String name;
    private int age;
    private int add(int a, int b){
         return a+b;
    }
    private static int multi(int a, int b){
        return a*b;
    }
    public void method2(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Demo1{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }

    static void method3(){
        System.out.println("Static method");
    }
    int getAdd(int p, int q){
        return add(p,q);
    }
    int getMulti(int p, int q){
        return Demo1.multi(p,q);
    }
}
class Demo2{
    void math() {
        Demo1 obj = new Demo1();
        obj.method2(21,"VINAY",25);
        Demo1.method3();
        System.out.println(obj);
        System.out.println("*******************************");
        System.out.println(obj.getAdd(5,7));
        System.out.println(obj.getMulti(10,7));
    }
}
public class LaunchEncap1 {
    static void main(String[] args) {
        Demo2 obj1= new Demo2();
        obj1.math();
    }
}
