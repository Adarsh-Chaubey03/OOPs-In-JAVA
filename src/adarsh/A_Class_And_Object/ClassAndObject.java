package adarsh.A_Class_And_Object;
///  Theory - (1) Class and Object
/*
In simple language:
A class describes what an object should contain(properties) and what it can do(behavior).
An object is a particular instance created from that class.

Formal Definition:
Class: A user-defined reference type that specifies the members, such as fields, constructors and methods, associated with its instances.
Object: A runtime entity created as an instance of a class. It has identity, state and behavior.


Property        	Class	                   Object
Meaning    	Blueprint or type	            Particular instance
Example	    Student                         A student with roll number 101
State	    Defines available fields    	Has its own instance-field values
Creation	Declared in source code      	Commonly created using new
Memory	    Metadata maintained by JVM	    An instance has storage for its instance state
 */

/// Implementation
class  Student {     // Class
    // Properties(or states)
    String name;
    int rollNumber;

    // behavior
    void  introduce(){
        System.out.println("I am "+ name + ", roll number " + rollNumber);
    }

}


public class ClassAndObject {
    public static void main(String[] args) {
        // object => will have the states and behavior defined by the class Student
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Adarsh";
        s1.rollNumber=  23103066;
        s1.introduce(); // I am Adarsh, roll number 23103066
    }
}


/// Real-world Examples
/*
Class	           Example state	                    Example behavior
Bank             Account Balance, account ID	        Deposit, withdraw
Employees	     Employee ID, salary                	Calculate salary
 */


/// Why Java is not purely object-oriented programming ?
/*
Java is a hybrid object-oriented language, meaning it includes both primitive types and reference types (objects).
Primitive values, such as int, double, boolean, and char, are raw data types built directly into the language,
rather than instances of the Object class.
 */
