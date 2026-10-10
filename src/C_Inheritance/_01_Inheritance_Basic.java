package C_Inheritance;
///  Inheritance Theory:
/*
 In Simple language:
 Imagine a Vehicle class with properties such as speed and behavior such as start().
 A Car is also a vehicle, so it can reuse those properties and behaviors while adding its own features, such as openTrunk().

Vehicle (Parent class)
speed · start()

Car (Child class)
inherits Vehicle · adds openTrunk()

Formal Definition:
Inheritance is an OOP mechanism in which a class acquires accessible fields and methods from another class, allowing code reuse and the creation of specialized classes.
- Parent / superclass: The class being inherited from.
- Child / subclass: The class that inherits from another class.
- Java uses the extends keyword for class inheritance.
 */
/// Java Implementation:

// Parent Class
class Vehicle {
    int speed = 100;

    void start(){
        System.out.println("Vehicle starts");
    }
}

// Child Class
class Car extends Vehicle {
    void openTrunk(){
        System.out.println("Car trunk opened");
    }
}


public class _01_Inheritance_Basic {
    public static void main(String[] args) {
        Car car = new Car();
        // Inherited field
        System.out.println(car.speed); // 100

        // Inherited method
        car.start(); // Vehicle starts

        // Method defined in Car
        car.openTrunk(); // Car trunk opened

    }
}

/// private members cannot be accessed directly from the child class.
/// We’ll cover access rules later.

/// Why do we use inheritance?
/*
Code reuse: Avoid duplicating common behavior.
Specialization: Extend a general class with more specific behavior.
Polymorphism: Allow a parent reference to refer to child objects and support runtime method dispatch.
Maintainability: Keep shared behavior in one place when the relationship genuinely represents an “is-a” relationship.
 */

/// Do not use inheritance merely to reuse code.
// If the relationship is “has-a” rather than “is-a,” composition may be more appropriate.