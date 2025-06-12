
package java_programming_element_level2;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int numberOne = sc.nextInt();

        System.out.print("Enter second number: ");
        int numberTwo = sc.nextInt();

        int addition = numberOne + numberTwo;
        int subtraction = numberOne - numberTwo;
        int multiplication = numberOne * numberTwo;

        
        String divisionResult;
        if (numberTwo != 0) {
            int division = numberOne / numberTwo;
            divisionResult = String.valueOf(division);
        } else {
            divisionResult = "undefined (division by zero)";
        }

        System.out.println("The addition, subtraction, multiplication, and division of " + numberOne + " and " + numberTwo + " are:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + divisionResult);

        sc.close();
    }
}
