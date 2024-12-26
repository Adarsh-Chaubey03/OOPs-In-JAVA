package adarsh.B_Constructors;

class Student {

    int roll_no;
    String name;
    float marks;

    // Creating Constructors
    Student() {                                              // We need a way to add the values of the above properties object by object 
        this.roll_no = 13;                                   // We need a word to access every object 
        this.name = "adarsh";                                // =>   'this' keyword is used for the same purpose
        this.marks = 93.6f;
    }

    void greeting() {
        System.out.println("Hello! My name is " + name);
    }

    void changeName(String newName) {
        name = newName;
    }

}

public class _1_Constructor {

    private static Student s1;

    public static void main(String[] args) {
        // Create an array of students
        Student[] students = new Student[5];
        Student s1 = new Student();
        System.out.println(s1); // by default constructor
        Student adarsh = new Student();

        System.out.println(adarsh.roll_no);
        System.out.println(adarsh.name);
        System.out.println(adarsh.marks);
        adarsh.greeting(); //Hello! My name is adarsh

        adarsh.changeName("adarsh1");
        adarsh.greeting();  //Hello! My name is adarsh1
    }
}


// s1.roll_no => does roll_no exist as variable in Student, if not => print default i.e. the value of empty
// can't ask for  the instances which are not available like s1.salary => error

