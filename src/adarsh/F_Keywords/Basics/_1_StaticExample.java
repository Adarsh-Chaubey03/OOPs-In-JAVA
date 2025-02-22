package adarsh.F_Keywords.Basics;

public class _1_StaticExample {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x: " + x);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    static {  // executed before all other
        System.out.println("Static Block Executed: ");
        b = a * 3;
    }

    public static void main(String[] args) {
        meth(42);
    }
}
/*
  ### OUTPUT
Static Block Executed:
x: 42
a: 3
b: 9

 */