package adarsh.K_Comparision;

public class Student implements Comparable<Student>{
    int roll_no;
    float marks;

    public Student(int roll_no, float marks) {
        this.marks = marks;
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return marks+" "+roll_no;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks-o.marks);
        return diff;
    }
}
