package adarsh.M_ExceptionHandling.Basics;

import java.util.Scanner;

/// AArrayIndexOutOfBoundsException - when we try to read/write on an index greater than the length of array
/// application of try-catch-finally block
public class _2_ArrayIOB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index to be divided by 0 :");
        int idx = sc.nextInt();

        //  try - catch - finally block
        try {
            int result = arr[idx] / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: Array Index Out Of Bound");
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Cannot Divide By Zero");
        } finally {
            System.out.println("This was an example of multiple catch in a try-catch-finally block");
        }

    }
}
