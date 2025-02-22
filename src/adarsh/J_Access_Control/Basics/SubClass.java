package adarsh.J_Access_Control.Basics;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(10,"ADARSH");
        String name = obj.name; //Protected

        System.out.println(obj instanceof A);         // true
        System.out.println(obj instanceof SubClass); // true
        System.out.println(obj instanceof Object);   // true
    }
}
