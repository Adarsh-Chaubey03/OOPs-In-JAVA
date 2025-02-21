package adarsh.D_MethodOverloading.Questions;

/*
  Create a class Shape with overloaded calculateArea() method for circle, rectangle & triangle  */

class Shape {
    double calculateArea(double radius) { // for circle
        return radius * radius * Math.PI;
    }

    double calculateArea(double length, double breadth) { // for rectangle
        return length * breadth;
    }

    double calculateArea( double a, double b, double c) {  // for triangle
        double  s = (a+b+c)/2;
        return Math.sqrt((s-a)*(s-b)*(s-c));
    }


}

public class _2_CalculateArea {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println(s.calculateArea(2.98)); // circle
        System.out.println(s.calculateArea(3.43,3.4)); // rectangle
        System.out.println(s.calculateArea(22,34.0,44));
    }
}
