package adarsh.E_Object_Passing.Basics;

import java.util.Scanner;

/*
. Create a Point class with attributes x and y. Write a method arePointsEqual that checks
 two Point objects equal or not, returns true if the points are equal, and false otherwise.

 */
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean arePointsEqual(Point p) {
        if (x == p.x && y == p.y) {
            return true;
        } else {
            return false;
        }
    }
}


public class _1_ObjectAsParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Point 1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter Point 2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);

        System.out.println("Is Point 1 and 2 same ?");
        System.out.println(p1.arePointsEqual(p2));

    }
}
