package adarsh.M_ExceptionHandling.Basics;
/// ArithmeticException =>  Ex- DIVIDE BY ZERO
/// try-catch block application

import java.util.*;

public class _1_ArithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int result = a / b;
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Cannot Divide By Zero");
        }
    }
}
