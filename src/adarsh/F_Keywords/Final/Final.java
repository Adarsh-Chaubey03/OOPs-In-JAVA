package adarsh.F_Keywords.Final;

public class Final {

    public static void main(String[] args) {

        final int a = 23;
        A adarsh = new A("adarsh");
        System.out.println(adarsh.name);
       ;

        // a =232; // error due to final keyword
    }

    /*  'final' Keyword => to avoid modification in any variable and make it constant => always initialise it
         while declaring

         * this immutability is only for primitive data type not for objects under 'final' bound
          but reassignment is not possible in any case*/


}


 class A {

    final int num = 3;
    String name;

    public A(String name) {
        this.name = name;
    }
}
