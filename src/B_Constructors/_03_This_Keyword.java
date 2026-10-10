package B_Constructors;
/// What is `this` ?
/*
'this' refers to the current object in an instance context.
 */


class Student3 {
    String name;

    Student3(String name) {
        this.name = name;
    }
    /*
There are two variables named name:
  - name refers to the constructor parameter.
  - this.name refers to the current object's instance field.
Without this, the assignment name = name would assign the parameter to itself, leaving the instance field unchanged.
     */
}

///  Another use of 'this' is Constructor Chaining
class Product {
    String name;
    double price;

    Product() {
        this("Unknown", 0.0);
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}


public class _03_This_Keyword {
    public static void main(String[] args) {
// When we execute: (Concept of Constructor Chaining)
        Product p = new Product();
// Java calls the no-argument constructor, which delegates to the parameterized constructor using this("Unknown", 0.0).
// his avoids duplicating initialization logic.
    }
}


/// Notes:
/*
Rules to remember:
- A this(...) constructor invocation must be the first statement in a constructor in Java 21 and earlier.
- A constructor cannot directly or indirectly chain back to itself.
- Java 25 introduced flexible constructor bodies, so the historical first-statement rule is version-dependent. We will use the traditional style for now.
 */

/// Constructor chaining with 'super' will be discussed later in inheritance