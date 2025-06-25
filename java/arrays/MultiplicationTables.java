package arrays;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input a number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Create an array to store multiplication results for 6 to 9
        int[] multiplicationResult = new int[4];  // indices 0 for 6, 1 for 7, 2 for 8, 3 for 9

        // Step 3: Use a loop to calculate the multiplication results
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // Step 4: Display the results
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
    }
}
