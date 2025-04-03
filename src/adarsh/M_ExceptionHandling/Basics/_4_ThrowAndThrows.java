package adarsh.M_ExceptionHandling.Basics;
/*
Create a user-defined Exception class called MyException that will raise
an exception if any user gives a salary value less than 2000. The program
should implement “throws” keyword
 */

import java.util.Scanner;

/// Exception is in-built class in java
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class SalaryValidator {
    public static void checkSalary(int salary) throws MyException {
        if (salary < 2000) {
            throw new MyException("Salary cannot be less than 2000");
        }
        System.out.println("Valid Salary: " + salary);
    }
}

public class _4_ThrowAndThrows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entry salary: ");
        int salary = sc.nextInt();

        try {
            SalaryValidator.checkSalary(salary);
        }catch (MyException e){
            System.out.println("Exception Caught: " + e.getMessage());
        }
        finally {
            System.out.println("This is application of throw and throws keyword");
        }

    }
}
