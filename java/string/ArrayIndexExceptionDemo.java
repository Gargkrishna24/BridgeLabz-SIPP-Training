package string;

import java.util.Scanner;

public class ArrayIndexExceptionDemo {

    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        System.out.println("Accessing index " + names.length + ": " + names[names.length]);
    }

    public static void handleException(String[] names) {
        System.out.println("Handling exception...");
        try {
            System.out.println("Accessing index " + names.length + ": " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        // Inputting names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Step 3: Calling method that generates the exception (uncaught)
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Step 4: Calling method that handles the exception with try-catch
        handleException(names);
    }
}

