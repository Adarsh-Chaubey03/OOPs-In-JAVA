package adarsh.B_Constructors.Basics;
// the other ways

 class Students {

    int roll_no;
    String name;
    float marks;

    Students(int roll_no, String name, float marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    /* Or we can use this method

    different variable name is also used. it is a good convention to use 'this' keyword

     *   Student(int roll, String nam, float mark) {
        this.roll_no = roll;
        this.name = nam;
        this.marks = mark;
    }

    OR
          Student(int roll, String nam, float mark) {
        roll_no = roll;
        name = nam;
        marks = mark;
    }
     */
}

public class _2_Constructor {

    public static void main(String[] args) {

                     Students[] students = new Students[5];
        Students adarsh = new Students(66,"Adarsh Chaubey",232.23f);

                                   System.out.println(adarsh.roll_no);
        System.out.println(adarsh.name);
                             System.out.println(adarsh.marks);

    }
}
