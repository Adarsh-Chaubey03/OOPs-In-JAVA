package adarsh.F_Properties_Of_OOPs.Inheritance;

public class _2_inheritance extends _1_Inheritance {
    double weight;

    public _2_inheritance() {
        this.weight = -1;
    }

    public _2_inheritance(double l, double h, double w, double weight) {
        // initialise the values present in the parent class
        super(l, h, w); // used to call parent class constructor
        this.weight = weight;

        //     System.out.println(super.w); // 34.0
        System.out.println(this.w);  // 34.0

    }

    public _2_inheritance(_3_Inheritance other) {
    }
}
