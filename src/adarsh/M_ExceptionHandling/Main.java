package adarsh.M_ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        //      int c = a/b; // Divide by zero -> arithmetic exception

        try {
            divide(a, b);
            String name = "ADARSH";
            if (name.equals("ADARSH")){
                throw new MyCustomException("NAME IS ADARSH");
            }
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());  //   ' / by zero '
        } finally {
            System.out.println("this will always be executed");
        }

    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("not possible");
        }
        return a / b;
    }

}
