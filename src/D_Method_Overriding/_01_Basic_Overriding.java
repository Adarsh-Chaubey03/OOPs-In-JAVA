package D_Method_Overriding;
///  Method Overriding - Theory
/*
Method overriding occurs when a subclass provides its own implementation of an inherited instance method while keeping
a compatible method signature and return type.
 */

class Animal {
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override // same method signature and return type
    void makeSound(){
        System.out.println("Dog Barks"); // Dog Barks
    }
}

class Cat extends Animal {
    @Override
    void makeSound(){
        System.out.println("Cat meows"); // Cat meows
    }
}



public class _01_Basic_Overriding {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
//        Although the reference type is Animal, the actual objects are Dog and Cat. Java selects the overridden
//        instance method based on the actual object's class at runtime.
        Animal b = new Cat();
        b.makeSound();
    }
}
