package adarsh.G_WrapperClassAnd_Varargs;

public class _2_OverloadingVarags {
    static void vaTest(int... v) {
        for (int x : v) {
            System.out.print(x + " ");
        }
    }

    static void vaTest(boolean... b) {
        for (boolean x : b) {
            System.out.print("\n" + x + " ");
        }
    }

//    static void vaTest(boolean a,boolean... b) {   // ambiguity error
//        for (boolean x : b) {
//            System.out.print("\n" + x + " ");
//        }
//        System.out.println("this is to create ambiguity in code");
//    }

    static void vaTest(String msg, int... v) {
        System.out.println("\n" + msg);
        for (int x : v) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("testing", 10, 20);
        vaTest(true);
    }
}

/*  Output:
    -------
1 2 3
testing
10 20
true

 */
