package adarsh.G_WrapperClassAnd_Varargs;

/*
a method accepts a variable length arguments using ...

invalid:
-------
 int method1(int a, int ...vals, double c){
}

valid:
-----
   int method2(int a, int b,double c, int ...vals){
   }

 */
public class _1_Varags {
    static void vaTest(int... v) {
        System.out.print("Number of args: " + v.length + " contents: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(2, 3, 4, 5);
        vaTest();
    }
}
/*
OUTPUT -
Number of args: 1 contents: 10
Number of args: 4 contents: 2 3 4 5
Number of args: 0 contents:
 */
