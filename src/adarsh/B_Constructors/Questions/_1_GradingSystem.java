package adarsh.B_Constructors.Questions;
/*
###
Write a Java program that takes marks for multiple subjects from the user, calculates the average, and assigns a grade based on the following criteria:

- A: 90 and above
- B 80 - 89
- C: 70 - 79
- D: 60 - 69
- F (Fail): Below 60

The program should:
1. Allow the user to enter the number of subjects.
2. Validate that marks are between 0 and 100.
3. Calculate and display the average marks.
4. Display the corresponding grade based on the calculated average.
 */

import java.util.Scanner;

class Grade {
    int[] marks;

    // constructor to initialise the marks
    Grade(int[] marks) {
        this.marks = marks;
    }

    // method to return the average
    double calculateAverage() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        return (double) sum / 5;
    }

    void myGrade() {
        double avg = calculateAverage();
        System.out.println("Average Marks: " + avg);
        if (avg >= 90) {
            System.out.println("Grade: A");
        } else if (avg >= 80) {
            System.out.println("Grade: B");
        } else if (avg >= 70) {
            System.out.println("Grade: C");
        } else if (avg >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }
    }

}

public class _1_GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter the Marks of all subjects One by One : ");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        Grade g1 = new Grade(marks);
        g1.myGrade();
    }
}
