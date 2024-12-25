package adarsh.F_Properties_Of_OOPs.Inheritance;


public class _1_Inheritance {
    double l;
    double h;
    double w;

    _1_Inheritance() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    _1_Inheritance(double side) {
        this.h = -side;
        this.l = -side;
        this.w = -side;
    }

    _1_Inheritance(double l, double h, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    _1_Inheritance(_1_Inheritance old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void display() {
        System.out.println("Running the _1_inheritance");
    }


    public static <_1_inheritance> void main(String[] args) {
        _1_Inheritance inH = new _1_Inheritance();
        System.out.println(inH.l + " " + inH.h + " " + inH.w);

        _1_Inheritance inH2 = new _1_Inheritance(4.6, 2.3, 4.8);
        System.out.println(inH2.l + " " + inH2.h + " " + inH2.w);

        // Trying to access_2_inheritance
        _2_inheritance inH2h = new _2_inheritance();
        System.out.println(inH2h.weight + " " + inH2h.l);

      /*  _2_inheritance inH2h1 = new _2_inheritance(1,2,34,4);
       this will give an error unless parent class constructor is not called in extend class
       method to call:
        public _2_inheritance(double l,double h,double w,double weight){
        super(l, h, w);
        this.weight=weight;
    }
       */
        _2_inheritance inH2h1 = new _2_inheritance(1, 2, 34, 4);
        System.out.println(inH2h1.weight + " " + inH2h1.l + " " + inH2h1.w);

/*
        _1_inheritance inH3= new _2_inheritance(9,2,34,4);  => error
        Object of the class can't access the properties of child of class
*/
         _3_Inheritance price = new _3_Inheritance();
        System.out.println(price.weight);

        _3_Inheritance price1 = new _3_Inheritance(2,3,2,14,5);
        System.out.println(price1.weight);
    }
}

