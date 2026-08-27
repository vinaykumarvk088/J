package Strings;

public class LaunchWrapper {
    static void main(String[] args) {
        int a = 10;   //Primitive data
        // Integer arg= new Integer(11);//integer object class
        Integer arg = Integer.valueOf(11); // Boxing
        int b = arg.intValue(); //Unboxing
        int c = arg;            // AutoUnBoxing
        Integer arg1 = a;       // AutoBoxing
        System.out.println("Primitive data: " + a);
        System.out.println("Integer object: " + arg);
        System.out.println("Unboxing: " + b);
        System.out.println("AutoUnBoxing: " + c);
        System.out.println("AutoBoxing: " + arg1);
    }
}
