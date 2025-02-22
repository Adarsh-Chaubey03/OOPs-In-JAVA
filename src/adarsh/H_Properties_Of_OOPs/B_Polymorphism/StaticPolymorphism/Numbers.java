package adarsh.H_Properties_Of_OOPs.B_Polymorphism.StaticPolymorphism;

/*
Static or Compile-time Polymorphism =>
   - Achieved via method overloading i.e. same name but different type of argument, return type,
    no. of parameters ,etc.
 */

// method overloading ---------

public class Numbers {
    int sum (int a,int b){
        return a+b;
    }
    int sum (int a,int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.sum(1,2,3);
        num.sum(4,7);
    }

}
