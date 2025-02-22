package adarsh.J_Access_Control.Basics;

public class ObjectDemo {
    float gpa;
    int num;
    int val;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }


    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override // number representation of object
    public int hashCode() {
        return super.hashCode(); // random number - to verify if object is same or not
        // return num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

  /*
    @Override  // already covered
    protected void finalize() throws Throwable {
        super.finalize();
    }
   */

    @Override
    public String toString() {   // already covered
        return super.toString();
    }


    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(324);
        System.out.println(obj.hashCode());

        ObjectDemo obj1 = new ObjectDemo(324, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(324, 78.9f);
        if (obj1.equals(obj2)) {
            System.out.println("obj is equal to obj2");
        }

        System.out.println(obj.getClass()); // class adarsh.G_Access_Control.Basics.ObjectDemo

    }
}
