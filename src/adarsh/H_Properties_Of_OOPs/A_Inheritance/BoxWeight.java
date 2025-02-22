package adarsh.H_Properties_Of_OOPs.A_Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        // initialise the values present in the parent class
        super(l, h, w); // used to call parent class constructor
        this.weight = weight;

        //     System.out.println(super.w); // 34.0
        System.out.println(this.w);  // 34.0

    }

    public BoxWeight(BoxZPrice other) {
    }
}
