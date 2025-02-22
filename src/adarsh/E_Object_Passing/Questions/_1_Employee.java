package adarsh.E_Object_Passing.Questions;

/*
### Design an Employee class with three attributes: name, age, and salary. Implement a method
    updateSalary(Employee emp, double newSalary) that takes an Employee object and a new salary
    as parameters, updating the employee’s salary accordingly. Additionally, create a
    method printDetails(Employee emp) that accepts an Employee object and prints its details.
*/

import java.util.Scanner;

public class _1_Employee {
    String name;
    int age;
    double salary;

    _1_Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void updateSalary(_1_Employee emp, double newSalary) {
        emp.salary = newSalary;
    }

    public static void printDetails(_1_Employee emp) {
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Salary: " + emp.salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the employee: ");
        String name = sc.nextLine();

        System.out.print("Enter the age of the employee: ");
        int age = sc.nextInt();

        System.out.print("Enter the salary of the employee: ");
        double salary = sc.nextDouble();

        _1_Employee emp = new _1_Employee(name, age, salary);

        System.out.print("Enter new salary: ");
        double newSalary = sc.nextDouble();

        System.out.println("\nBefore salary increase, details of employee:");
        printDetails(emp);

        updateSalary(emp, newSalary);

        System.out.println("\nAfter salary increase, details of employee:");
        printDetails(emp);
    }
}
