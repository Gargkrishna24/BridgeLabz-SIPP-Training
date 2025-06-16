package Control_Flow;

import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Factors of " + number + ":");
            int counter = 1;
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Invalid input! Enter a positive integer.");
        }

        scanner.close();
    }
}