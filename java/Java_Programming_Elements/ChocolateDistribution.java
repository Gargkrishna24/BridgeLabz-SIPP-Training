package java_programming_elements_level1;

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of chocolates and children
        System.out.print("Enter the number of chocolates (N): ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children (M): ");
        int numberOfChildren = scanner.nextInt();

        // Calculate chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the result
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                         " and the number of remaining chocolates is " + remainingChocolates);

        scanner.close();
    }
}