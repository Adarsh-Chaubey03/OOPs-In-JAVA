package adarsh.E_Object_Passing.Questions;

import java.util.Scanner;

class _2_UserCredential {
    private String uName;  // username
    private String pass;   // password


    _2_UserCredential(String uName, String pass) {
        this.uName = uName;
        this.pass = pass;
    }

    // Copy constructor
    _2_UserCredential(_2_UserCredential other) {
        this.uName = other.uName;
        this.pass = other.pass;
    }

    // Validation method will return true or false
    boolean validate() {
        return uName != null && pass != null && pass.length() >= 4 && pass.length() <= 8;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter username: ");
        String uName = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        // Creating the first object
        _2_UserCredential user1 = new _2_UserCredential(uName, pass);

        // Creating the second object using the first object (copy constructor)
        _2_UserCredential user2 = new _2_UserCredential(user1);

        // Validating both objects
        System.out.println(user1.validate() ? "The first object is validate" : "The first object is not validate");
        System.out.println(user2.validate() ? "The second object is validate" : "The second object is not validate");

    }
}
