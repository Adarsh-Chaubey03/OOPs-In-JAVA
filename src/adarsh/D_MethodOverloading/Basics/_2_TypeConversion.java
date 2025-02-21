package adarsh.D_MethodOverloading.Basics;

//------------   [ AUTOMATIC CONVERSION OF TYPE WHILE OVERLOADING ] -------------------------------------------

class OverloadDemo {
    void test() {
        System.out.println();
    }

    void test(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
    }

    void test(double a) {
        System.out.println("In double: " + a);
    }
}

public class _2_TypeConversion {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        int i = 80;

        obj.test();
        obj.test(1, 5);
        obj.test(8.5);
        obj.test(i);  // 80.0
        /*
        obj.test(i);

        Widening Conversion :       *    int -> double
        -------------------         *    automatically and internally

        Narrowing Conversion :      *    double -> int
        -------------------         *    non-automatic & explicitly type-casted

         */

    }

}
