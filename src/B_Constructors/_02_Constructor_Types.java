package B_Constructors;
/// Types of Constructors
/*
Java does not have separate constructor keywords for different types.
*/

/// A- Default Constructor
// If you declare no constructor at all, the compiler provides a default no-argument constructor.
class Student {
    String name;
}

/// B- No-argument constructor
//A constructor explicitly declared with no parameters.
class Student1 {
    String name;

    Student1() {
        name = "Unknown";
    }
}
// Unlike the default constructor, this constructor is written by the programmer.

/// Parameterized Constructor
// A constructor that accepts arguments.
class Student2 {
    String name;

    Student2(String name) {
        this.name = name;
    }
}
///  Note:
/*
Once you declare a constructor yourself, Java does not automatically provide the default constructor.
 If you declare only Student(String name), then new Student() will not compile unless you also declare
 a no-argument constructor.
 */
public class _02_Constructor_Types {



    public static void main(String[] args) {
        Student s = new Student();
//        name initially has the default value null.


        Student1 s1 = new Student1();

        Student2 s2 = new Student2("Adarsh");

    }
}
