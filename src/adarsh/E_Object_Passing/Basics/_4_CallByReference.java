package adarsh.E_Object_Passing.Basics;

public class _4_CallByReference {

    int a, b;

    _4_CallByReference(int i, int j) {
        a = i;
        b = j;
    }

    // Call By Reference => object is passed as parameter
    void meth(_4_CallByReference ob) {
        ob.a *= 10;
        ob.b /= 10;

    }

    public static void main(String[] args) {
        _4_CallByReference obj = new _4_CallByReference(10,20);
        System.out.println(obj.a + " " + obj.b);  // 10 20
        obj.meth(obj);  // any modification inside the method will  affect the original value
        System.out.println(obj.a + " " + obj.b);  // 100 2
    }
}
