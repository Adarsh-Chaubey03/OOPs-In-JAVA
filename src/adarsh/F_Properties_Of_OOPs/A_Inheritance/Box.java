package adarsh.F_Properties_Of_OOPs.A_Inheritance;


public class Box {
    double l;
    double h;
    double w;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box(double side) {
        this.h = -side;
        this.l = -side;
        this.w = -side;
    }

    Box(double l, double h, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void display() {
        System.out.println("Running the _1_inheritance");
    }
    static void greeting(){
        System.out.println("Hey I am in Box class");
    }



    public static <_1_inheritance> void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l + " " + box.h + " " + box.w);

        Box box1 = new Box(4.6, 2.3, 4.8);
        System.out.println(box1.l + " " + box1.h + " " + box1.w);

        // Trying to access_2_inheritance
        BoxWeight inH2h = new BoxWeight();
        System.out.println(inH2h.weight + " " + inH2h.l);

      /*  BoxWeight box3 = new BoxWeight(1,2,34,4);
       this will give an error unless parent class constructor is not called in extend class
       method to call:
        public BoxWeight(double l,double h,double w,double weight){
        super(l, h, w);
        this.weight=weight;
    }
       */
        BoxWeight box3 = new BoxWeight(1, 2, 34, 4);
        System.out.println(box3.weight + " " + box3.l + " " + box3.w);

/*
        _1_inheritance inH3= new BoxWeight(9,2,34,4);  => error
        Object of the class can't access the properties of child of class
*/
         BoxZPrice price = new BoxZPrice();
        System.out.println(price.weight);

        BoxZPrice price1 = new BoxZPrice(2,3,2,14,5);
        System.out.println(price1.weight);
    }
}

