package arrays;

import java.util.Scanner;

public class LargestTwoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        number = Math.abs(number); // to handle negative numbers

        // Step 2: Initialize digit storage
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 4-6: Extract digits and store in array
        while (number != 0) {
            int digit = number % 10;
            number = number / 10;

            // Check if array needs to be resized
            if (index == maxDigit) {
                maxDigit *= 2;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            digits[index] = digit;
            index++;
        }

        // Step 7: Find largest and second largest
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Step 9: Display results
        System.out.println("\nDigits in the number:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\n\nLargest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit not found (all digits are same or only one digit exists).");
        }
    }
}
