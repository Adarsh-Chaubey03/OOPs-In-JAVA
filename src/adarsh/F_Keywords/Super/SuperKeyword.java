package adarsh.F_Keywords.Super;

/// 'SUPER' KEYWORD
/*
- use to inherit super class properties
- used to call constructor of super class
 */
// Write a Java program that calculates interest for different types of bank accounts.
// The program should use inheritance, with Savings (7%) and Current (4%) accounts.
// It should compute interest for a given balance over a specified time period.
// Implement appropriate classes and methods to achieve this functionality.

class Bank {
    double balance;

    Bank(double balance) {
        this.balance = balance;
    }

    double calculateInterest(double rate, double time) {
        return (balance * rate * time) / 100;
    }

}

class Savings extends Bank {
    Savings(double balance) {
        super(balance);
    }

    double findInterest(double time) {
        return calculateInterest(7, time);
    }

}

class Current extends Bank {
    Current(double balance) {
        super(balance);
    }

    double findInterest(double time) {
        return calculateInterest(4, time);
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        Savings s = new Savings(10000);
        Current c = new Current(10000);

        System.out.println("Savings Account Interest for 3.6 years: " + s.findInterest(3.6));
        System.out.println("Current Account Interest for 2.5 years: " + c.findInterest(2.5));
    }

}