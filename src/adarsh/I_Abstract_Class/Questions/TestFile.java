package adarsh.I_Abstract_Class.Questions;

// Abstract class demonstration

abstract class Figure {
    double dim1, dim2;

    Figure(double l, double b) {
        dim1 = l;
        dim2 = b;
    }

    abstract double findArea(); // Abstract method
}

class Rectangle extends Figure {
    Rectangle(double l, double b) {
        super(l, b);
    }

    double findArea() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double b, double h) {
        super(b, h);
    }

    double findArea() {
        return dim1 * dim2 * 0.5;
    }
}

class TestFigure {
    public static void main(String args[]) {
        // Figure f = new Figure(10, 20); // Error: Cannot instantiate an abstract class

        Figure f1 = new Rectangle(10, 20);
        Figure f2 = new Triangle(5, 10);

        System.out.println("Rectangle Area: " + f1.findArea());
        System.out.println("Triangle Area: " + f2.findArea());
    }
}