package B_Constructors;
/// 02) Constructor - Theory
/*
In Simple Language:
Imagine buying a new phone. Before you use it, it needs an initial setup: language, settings, and other starting values.
A constructor performs a similar role for an object. It establishes the object's initial state when the object is created.


Formal Definition:
A constructor is a special class member used to initialize a new instance. It has the same name as the class
and has no return type—not even void.

 */
// class
class BankAccount {
    String owner;
    double balance;

    // Constructor
    BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance=balance;
        // We will understand 'this' keyword later in the same package.
    }

}

public class _01_Basic_Constructor {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Adarsh", 5000);
        //ere, the constructor initializes the account's owner and balance as the object is created.

        System.out.println(acc1.owner + ": "+ acc1.balance); // Adarsh: 5000.0
    }
}
