package adarsh.K_Comparision;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        // Lambda Functions

        arr.forEach(item -> System.out.println(item * 2));
        //  or Consumer type [Both are same]
        System.out.println("Consumer Type");
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);


        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;

        LambdaFunction myCal = new LambdaFunction();
        System.out.println((myCal.operate(5, 6, sum)));
        System.out.println((myCal.operate(5, 6, sub)));
        System.out.println((myCal.operate(5, 6, mul)));


    }


    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

}


interface Operation {
    int operation(int a, int b);
}
