package adarsh.J_Access_Control.Basics;

public class A {
    private int num;  //    Private
     protected String name;
    int[] arr;

   public A(int num, String name){
       this.num=num;
       this.name=name;
       this.arr=new int[num];
   }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num =num;
    }
}
