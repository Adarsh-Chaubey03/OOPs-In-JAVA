package adarsh.H_Properties_Of_OOPs.A_Inheritance;
// creating multilevel inheritance
public class BoxZPrice extends BoxWeight {
    double cost;
    BoxZPrice(){
        super();
        this.cost=-1;
    }

BoxZPrice(BoxZPrice other){
        super(other);
        this.cost=other.cost;
    }
BoxZPrice(double l, double h, double w, double weight, double cost){
    super(l, h, w, weight);
    this.cost=cost;
}

}
