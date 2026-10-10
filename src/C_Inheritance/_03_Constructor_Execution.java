package C_Inheritance;

// When you create a child-class object, Java must initialize its parent-class portion too.

/// Why does a parent constructor execute first?

// Consider this example:
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor");
    }
}

public class _03_Constructor_Execution {
        public static void main(String[] args) {
            Dog d = new Dog();
            /*
            Output:
            Animal constructor
            Dog constructor
             */
            ///   Why does Animal print first?
//            A Dog object contains the state defined by Dog and its superclass Animal.
//           The superclass initialization must happen before the subclass constructor body proceeds.
        }
}
