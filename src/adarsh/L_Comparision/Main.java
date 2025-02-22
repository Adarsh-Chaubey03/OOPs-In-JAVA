package adarsh.L_Comparision;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(32, 532.23f);
        Student s2 = new Student(34, 32.23f);
        Student s3 = new Student(54, 42.23f);
        Student s4 = new Student(38, 34.23f);
        Student s5 = new Student(39, 32.3f);

        Student[] list = {s1,s2,s3,s4,s5};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

        if (s1.compareTo(s2) < 0) {
            System.out.println("s2 has more marks");
        } else if (s1.compareTo(s2) == 0) {
            System.out.println("s1 and s2 have equal marks");
        } else {
            System.out.println("s1 has more marks");
        }

    }
}
