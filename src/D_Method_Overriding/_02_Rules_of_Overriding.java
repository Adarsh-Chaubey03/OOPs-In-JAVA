package D_Method_Overriding;
/// Rules of method overriding

/// Rule 1: The method signature must match
class Parent {
    void display(int x) { }
}

class Child extends Parent {
    @Override
    void display(int x) { } // Valid override
}


class Child1 extends Parent {
    void display(String x) { } // Overloading, not overriding
}



///  Rule 2: Return types must be compatible
//  A subclass may use the same return type or a covariant return type when overriding a reference-returning method.


/// Rule 3: Access cannot become more restrictive
// An override cannot reduce accessibility. For example, changing public to protected is invalid.


/// Rule 4: final methods cannot be overridden
 // A final instance method prevents subclasses from replacing its implementation.
class Parent1 {
    final void show() { }
}

class Child2 extends Parent1 {
    // void show() { } // Compilation error
}


/// Rule 5: private methods are not overridden
//A private method is not inherited as an accessible subclass method, so a same-named method in the subclass is a separate
//declaration, not an override.

/// Rule 6: Static methods are hidden, not overridden
class A {
    static void show() {
        System.out.println("Parent");
    }
}

class B extends A {
    static void show() {
        System.out.println("Child");
    }
}

public class _02_Rules_of_Overriding {
    public static void main(String[] args) {
        A obj = new B();
        obj.show(); // Parent
        // Here, Static method calls are resolved using the reference type.
    }
}
