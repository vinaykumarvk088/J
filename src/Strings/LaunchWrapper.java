package Strings;

public class LaunchWrapper {
    static void main(String[] args) {
        int a = 10;   //Primitive data
        // Integer arg= new Integer(11);//integer object class
        Integer arg = Integer.valueOf(11); // Boxing
        int b = arg.intValue(); //Unboxing
        int c = arg;            // AutoUnBoxing
        Integer arg1 = a;       // AutoBoxing
    }
}
