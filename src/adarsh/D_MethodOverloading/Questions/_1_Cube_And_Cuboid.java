package adarsh.D_MethodOverloading.Questions;

/*
Use method Overloading to calculate the volume of a cube and cuboid
 */

class Box {
    double width, height, depth;

    Box(double w, double h, double d) {   // for cuboid
        width = w;
        height = h;
        depth = d;
    }

    Box(double h) {   // for cube
        height = depth = width = h;
    }

    Box() { // constructor to initialise the instance variables
        width = height = depth = -1;
    }

    double volume() {
        return height * width * depth;
    }


}

public class _1_Cube_And_Cuboid {
    public static void main(String[] args) {
        Box cbd = new Box(1.4, 5.6, 4.4);
        Box cb = new Box(1.5);
        Box b2 = new Box();
        System.out.println("Volume of Cuboid : " + cbd.volume());
        System.out.println("Volume of Cube : " + cb.volume());
        System.out.println("Default Constructor " + b2.volume());

    }
}
