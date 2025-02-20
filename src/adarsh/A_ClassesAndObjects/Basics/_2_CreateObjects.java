package adarsh.A_ClassesAndObjects.Basics;

class Student {
    int roll_no;
    String name;
    float marks;
}
public class _2_CreateObjects {
    public static void main(String[] args) {

        //  Student adarsh; (Declaring object)
        //  adarsh = new Student();  (initialising object)

        Student adarsh = new Student();
        System.out.println(adarsh.roll_no);
        System.out.println(adarsh.name);
        System.out.println(adarsh.marks);

    }
}

