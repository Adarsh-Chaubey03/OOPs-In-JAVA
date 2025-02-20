package adarsh.B_Constructors.Basics;

// the other ways

class Studentz {

    int roll_no;
    String name;
    float marks;

    Studentz(int roll_no, String name, float marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }
    // this is how to call one constructor from another

    Studentz() {
        this(13, "adarsh", 81);
    }
}

public class _3_Constructor {

    public static void main(String[] args) {
        Studentz adarsh = new Studentz();

        System.out.println(adarsh.roll_no);
        System.out.println(adarsh.name);
        System.out.println(adarsh.marks);

    }
}

