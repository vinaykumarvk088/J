package Constructors;

class Examine {
    Examine() {
        System.out.println("Constructor of Examine class");
    }
    Examine(String name) {
        super();
        System.out.println("Constructor of Examine class with parameter: " + name);
    }
     Examine(int age, String name) {
     this();
     System.out.println("Constructor of Examine class with parameter: " + name);
    }
}

public class Constructor2 {
    public static void main(String[] args) {
        // Examine e1 = new Examine();
       new Examine("Alice");
       new Examine(25, "Bob");

    }
}
