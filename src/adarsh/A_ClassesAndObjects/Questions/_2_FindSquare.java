package adarsh.A_ClassesAndObjects.Questions;

import java.util.Scanner;

// class to return the square of any number
class Square {
    int side;

    Square(int side) {
        this.side = side;
    }

    int findSquare() {
        return side * side;
    }

}

public class _2_FindSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Square s1 = new Square(n); // object of the Square class
        System.out.println("Square is " + s1.findSquare());

    }
}
