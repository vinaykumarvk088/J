package Inheritance;

class Animals{
    void walk(){
        System.out.println("Animal is walking");
    }
    void sound(){
        System.out.println("Animal is making sound");
    }
    void eating() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animals{
    void eating(){
        System.out.println("Dog is eating with its tongue");
    }
    void sound() {
        System.out.println("Dog is barking");
    }
    void protector(){
        System.out.println("Dog protects its owner");
    }
}
class Cat extends Animals{
    void walk(){
        System.out.println("Cat walks in a rhythmic manner");
    }
    void sound(){
        System.out.println("Cat sounds like meow");
    }
    void eating(){
        System.out.println("Cat eats only veggies");
    }
    void pawing(){
        System.out.println("Cat regularly brushes its hair with its paws");
    }
}
public class inheritance2 {
    static void main(String[] args) {
        Animals ob=new Dog();         //Up Casting (Polymorphism)
        ob.eating();
        ob.sound();
        ((Dog) ob).protector();      //Down Casting
        Animals ob1=new Cat();
        ob1.walk();
        ob1.sound();
        ob1.eating();
        ((Cat) ob1).pawing();         //Down Casting
    }
}
