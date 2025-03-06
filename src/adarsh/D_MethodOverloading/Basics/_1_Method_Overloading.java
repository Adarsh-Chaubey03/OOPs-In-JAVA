package adarsh.D_MethodOverloading.Basics;
/*
  ### Overloading Method -
  ------------------------

      -> multiple methods with same name but different parameter list
      -> return type alone is insufficient to distinguish between methods
      -> no need to create separate object for every method

 */

class Calculator {
    double add(double a, double b) {  // method 1
        return a + b;
    }

    double add(double a, double b, double c) {  // method 2
        return a + b + c;
    }

    int add(int a, int b) {      // method 3
        return a + b;
    }
}

public class _1_Method_Overloading {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(2.5, 1.5)); // it will call method 1
        System.out.println(c1.add(1, 5)); // it will call method 3
        System.out.println(c1.add(2.3, 4.5, 3.3));  // it will call method 2

        // the method is distinguished based on the type and no. of parameters

    }
}
