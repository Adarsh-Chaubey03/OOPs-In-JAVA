package adarsh.H_Properties_Of_OOPs.A_Inheritance.Basics;
/* ## OVERRIDING
     -----------
- same parameter
- same method name
- different implementation
- only in inheritance
- not allowed in private, final and static
 */


class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
        super.sound();
    }
}


public class MethodOverriding {
    public static void main(String[] args) {

        Animal a = new Animal();
        Dog d = new Dog();

        a.sound(); // Calls Animal's sound method  ---> Animal makes sound
        d.sound();
        /* Calls Dog's sound method, then Animal's sound method via super
        Dog barks
        Animal makes sound
         */
    }
}
