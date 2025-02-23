package adarsh.F_Keywords.Static;

public class _3_StaticKeyword {

    // Static variable initialization
    static int a = 4;  // `a` is initialized with 4
    static int b;      // `B` is declared

    // Static block
    static {
        System.out.println("this is a static block");
        b = a + 5;  // Initialize `B` as `a + 5`, so `B = 9`
    }

    public static void main(String[] args) {
        // Create the first object
        _3_StaticKeyword obj = new _3_StaticKeyword();

        // Print the values of `a` and `B`
        System.out.println(_3_StaticKeyword.a + " " + _3_StaticKeyword.b);

        // Modify the value of static variable `B`
        _3_StaticKeyword.b += 3;  // `B` is now 12

        // Create the second object
        _3_StaticKeyword obj2 = new _3_StaticKeyword();

        // Print the updated values of `a` and `B`
        System.out.println(_3_StaticKeyword.a + " " + _3_StaticKeyword.b);
    }
}
