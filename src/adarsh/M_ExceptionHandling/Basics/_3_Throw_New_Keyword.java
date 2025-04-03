package adarsh.M_ExceptionHandling.Basics;

/* Create a class called ClassThrow that creates and throws an Arithmetic
exception when the user inputs any negative numbers.
 */

import java.util.Scanner;

class ClassThrow {
    public static void checkNumber(int num) {
        if (num < 0) {
            throw new ArithmeticException("Negative numbers are not allowed");
        }
        System.out.println("Valid Input: " + num);
    }
}

public class _3_Throw_New_Keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            ClassThrow.checkNumber(num);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Example Using Different Class");
        }

    }
}
