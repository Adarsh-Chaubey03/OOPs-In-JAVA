package adarsh.H_Properties_Of_OOPs.A_Inheritance.Question;

/// METHOD OVERRIDING
class Shape {
    void area() {
        System.out.println("Shape not defined");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    @Override
    void area() {
        System.out.println("Circle Area = " + Math.PI * radius * radius);
    }

}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        System.out.println("Rectangle Area = " + length * breadth);
    }

}

public class ShapeArea {
    public static void main(String[] args) {
        Shape s;
        s = new Circle(5);
        s.area();

        s = new Rectangle(10, 20);
        s.area();
    }

}