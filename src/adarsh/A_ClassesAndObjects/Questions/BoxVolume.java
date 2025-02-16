package adarsh.A_ClassesAndObjects.Questions;

import java.util.Scanner;

class Box {
    // instance variables
    int width;
    int height;
    int depth;

    // instance method
    int findVolume() {
        return width * height * depth;
    }

    // Constructor -> to initialise the value
    Box(int w, int h, int d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }
}

public class BoxVolume {
    public static void main(String args[]) {
        Box b1 = new Box(5, 10, 10);
        System.out.println("Volume is: " + b1.findVolume());

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int d = sc.nextInt();

        Box b2 = new Box(w, h, d); // Actual Parameter
        System.out.println("Volume is: " + b2.findVolume());

        sc.close();
    }
}
