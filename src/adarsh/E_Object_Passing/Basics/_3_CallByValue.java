package adarsh.E_Object_Passing.Basics;

public class _3_CallByValue {
    void meth(int i, int j) {
        i *= 10;
        j *= 10;
    }

    public static void main(String[] args) {
        _3_CallByValue ob = new _3_CallByValue();
        int i = 10;
        int j = 20;
        System.out.println(i + " " + j);  // 10 20
        ob.meth(i, j);  // any modification inside the method will not affect the original value
        System.out.println(i + " " + j);  // 10 20
    }
}
