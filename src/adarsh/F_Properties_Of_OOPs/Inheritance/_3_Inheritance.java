package adarsh.F_Properties_Of_OOPs.Inheritance;
// creating multilevel inheritance
public class _3_Inheritance extends _2_inheritance{
    double cost;
    _3_Inheritance(){
        super();
        this.cost=-1;
    }

_3_Inheritance(_3_Inheritance other){
        super(other);
        this.cost=other.cost;
    }
_3_Inheritance(double l,double h,double w,double weight,double cost){
    super(l, h, w, weight);
    this.cost=cost;
}

}
