package adarsh.E_Object_Passing.Basics;
/*

Passing an object as an argument to a constructor is useful when
we need to copy object data or initialise a new object using an existing one

 */

import java.util.Scanner;

class Car {
    String model;
    int year;

    Car() {
        model = null;
        year = -1;
    }

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // clone the object and increase the value of year by 1
    Car(Car c) {
        model = c.model;
        year = c.year + 1;
    }
}

public class _2_ObjectInConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter model name : ");
        String model = sc.nextLine();

        System.out.print("Enter model year: ");
        int year = sc.nextInt();

        Car ca = new Car(model,year);
        System.out.println("Before Cloning: " + ca.model + "-"+ ca.year);

        Car cb = new Car(ca);
        System.out.println("After Cloning: " + cb.model + "-"+ cb.year);
    }
}
