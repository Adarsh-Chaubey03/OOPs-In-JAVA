package C_Inheritance;
///  What if the parent has only a parameterized constructor?

class Animal2 {
    String name;

    Animal2(String name) {
        this.name = name;
    }
}

class Dog2 extends Animal2 {
    Dog2() {
        super("Bruno");
        // super("Bruno") calls Animal(String name), which initializes the inherited name field
    }
}

///  What happens if we remove super("Bruno")?
/*
class Dog2 extends Animal2 {
    Dog2() {
        // No explicit superclass constructor invocation
    }
}
This fails to compile because Java attempts to invoke super() implicitly, but Animal has no no-argument constructor.
Rule: If the superclass has no accessible no-argument constructor,
      the subclass must invoke an appropriate superclass constructor explicitly.
 */
public class _05_Super_With_ParametrizedConstructor {
    public static void main(String[] args) {
        Dog2 d2 = new Dog2();
        System.out.println(d2.name); // Bruno

    }

}


/// this()  vs super():
/*
        this()	                                                super()
Calls another constructor in the same class            Calls a constructor in the direct superclass
Used for constructor chaining within a class	       Used to initialize the superclass portion
Example: this("Bruno");	                               Example: super("Bruno");

 */