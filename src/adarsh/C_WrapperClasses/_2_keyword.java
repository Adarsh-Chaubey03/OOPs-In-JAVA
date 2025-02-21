package adarsh.C_WrapperClasses;

public class _2_keyword {

    public static void main(String[] args) {

        final int a = 23;

        // a =232; // error due to final keyword
    }
    /*  'final' Keyword => to avoid modification in any variable and make it constant => always initialise it
         while declaring

         * this immutability is only for primitive data type not for objects under 'final' bound
          but reassignment is not possible in any case*/
    final A adarsh = new A("adarsh");

}

class A {

    final int num = 3;
    String name;

    public A(String name) {
        this.name = name;
    }
}
