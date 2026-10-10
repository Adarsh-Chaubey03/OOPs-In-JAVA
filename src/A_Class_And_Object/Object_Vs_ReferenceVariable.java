package A_Class_And_Object;

class Students {
    String name;

    Students(String name) {
        this.name = name;
    }
}

public class ObjectVsReferenceVariable {

    // Java passes a COPY of the reference value.
    static void changeName(Students s) {
        s.name = "Aman"; // Modifies the original object
    }

    // Reassigning the copied reference affects only local s.
    static void replaceStudent(Students s) {
        s = new Students("Rahul");
    }

    public static void main(String[] args) {

        // Object: created using new
        // s1: reference variable pointing to the object
        Students s1 = new Students("Adarsh");

        // Copies the reference, not the object
        Students s2 = s1;

        s2.name = "Karan";
        System.out.println(s1.name); // Karan

        changeName(s1);
        System.out.println(s1.name); // Aman

        replaceStudent(s1);
        System.out.println(s1.name); // Aman

        System.out.println(s2.name); // Aman
    }
}

/*
SHORT NOTE:

1. Object: An instance created using the new keyword.

2. Reference variable: Holds a reference to an object.
   Multiple variables can refer to the same object.

3. Java is ALWAYS pass-by-value.
   When an object reference is passed to a method,
   a COPY of the reference value is passed.

4. Modifying the object through the copied reference
   changes the same original object.

5. Reassigning the copied reference does not change
   the caller's reference.

IMPORTANT:
Java does NOT support pass-by-reference.
*/
