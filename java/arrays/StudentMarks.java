package arrays;
import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Take input for number of students
        System.out.print("Enter number of students: ");
        int num = sc.nextInt();

        // 2. Create arrays
        int[][] marks = new int[num][3]; // 3 subjects: Physics, Chemistry, Maths
        double[] percentage = new double[num];
        char[] grade = new char[num];

        // 3. Input marks
        for (int i = 0; i < num; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                System.out.print(subject + ": ");
                int mark = sc.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid input. Please enter a value between 0 and 100.");
                    j--; // re-enter the same subject
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        // 4. Calculate percentage and grade
        for (int i = 0; i < num; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 80) grade[i] = 'B';
            else if (percentage[i] >= 70) grade[i] = 'C';
            else if (percentage[i] >= 60) grade[i] = 'D';
            else grade[i] = 'F';
        }

        // 5. Display all results
        System.out.println("\nStudent Report:");
        for (int i = 0; i < num; i++) {
            System.out.println("Student " + (i + 1) +
                " - Physics: " + marks[i][0] +
                ", Chemistry: " + marks[i][1] +
                ", Maths: " + marks[i][2] +
                ", Percentage: " + String.format("%.2f", percentage[i]) + "%" +
                ", Grade: " + grade[i]);
        }

        sc.close();
    }
}