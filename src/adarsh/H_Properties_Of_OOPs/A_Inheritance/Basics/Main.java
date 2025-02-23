package adarsh.H_Properties_Of_OOPs.A_Inheritance.Basics;
/*

Inheritance allows a class (subclass/child class) to inherit properties (fields/variables) and
behaviors(method) from another class.

'extends' keyword is used to inherit



   ########   SINGLE INHERITANCE   ############
   FOR OTHER TYPES VISIT TO QUESTION SECTIONS
 */
class A {
    int a;

    void show() {
        System.out.println(a);
    }
}

class B extends A {
    int b;

    void sum() {
        System.out.println("Sum: " + (a + b));
    }

}

public class Main {
    public static void main(String[] args) {
        A obA = new A();
        B obB = new B();
        obB.a = 10;
        obB.b = 15;

      //   obA.b = 10; error ---> super class can't access sub class
        obA.show();  // 0
        obB.show();  // 10
        obB.sum();   // Sum: 25
    }
}
