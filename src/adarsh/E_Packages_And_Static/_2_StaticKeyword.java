package adarsh.E_Packages_And_Static;

public class _2_StaticKeyword {

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
        _2_StaticKeyword obj = new _2_StaticKeyword();

        // Print the values of `a` and `B`
        System.out.println(_2_StaticKeyword.a + " " + _2_StaticKeyword.b);

        // Modify the value of static variable `B`
        _2_StaticKeyword.b += 3;  // `B` is now 12

        // Create the second object
        _2_StaticKeyword obj2 = new _2_StaticKeyword();

        // Print the updated values of `a` and `B`
        System.out.println(_2_StaticKeyword.a + " " + _2_StaticKeyword.b);
    }
}
