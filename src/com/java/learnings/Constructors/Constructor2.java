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
        Examine e2 = new Examine("Alice");
        Examine e3 = new Examine(25, "Bob");

    }
}
