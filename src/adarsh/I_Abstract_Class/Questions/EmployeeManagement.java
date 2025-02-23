package adarsh.I_Abstract_Class.Questions;

/*
   Question:
   Design a Java program using an abstract class to model an Employee Management System.

   Requirements:
   1. Create an abstract class Employee with the following:
      - Attributes: name and employee ID.
      - An abstract method calculateSalary() that will be implemented in subclasses.
      - A concrete method display() to print employee details.

   2. Create two subclasses:
      - FullTimeEmployee:
          - Additional attribute: monthlySalary.
          - Implements calculateSalary().

      - PartTimeEmployee:
          - Attributes: hourlyWage and hoursWorked.
          - Implements calculateSalary() by computing hourlyWage * hoursWorked.

   3. In the main() method:
      - Create an instance of FullTimeEmployee with sample data.
      - Create an instance of PartTimeEmployee with sample data.
      - Call display() and calculateSalary() for both employees.

   Expected Output:
   -------------------
   Employee ID: 101
   Name: Alice
   Salary: Rs 5000.0

   Employee ID: 102
   Name: Bob
   Salary: Rs 800
*/

abstract class Employee {
    String name;
    int employeeID;

    // Constructor
    Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    // Abstract method to calculate salary
    abstract double calculateSalary();

    // Concrete method to display employee details
    void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
    }
}

// Subclass FullTimeEmployee
class FullTimeEmployee extends Employee {
    double monthlySalary;

    // Constructor
    FullTimeEmployee(String name, int employeeID, double monthlySalary) {
        super(name, employeeID);
        this.monthlySalary = monthlySalary;
    }

    // Implement calculateSalary method
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// Subclass PartTimeEmployee
class PartTimeEmployee extends Employee {
    double hourlyWage;
    int hoursWorked;

    // Constructor
    PartTimeEmployee(String name, int employeeID, double hourlyWage, int hoursWorked) {
        super(name, employeeID);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Implement calculateSalary method
    @Override
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating instances of FullTimeEmployee and PartTimeEmployee
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", 101, 5000.0);
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Bob", 102, 100, 8);

        // Displaying details and salary
        fullTimeEmp.display();
        System.out.println("Salary: Rs " + fullTimeEmp.calculateSalary());
        System.out.println();

        partTimeEmp.display();
        System.out.println("Salary: Rs " + partTimeEmp.calculateSalary());
    }
}