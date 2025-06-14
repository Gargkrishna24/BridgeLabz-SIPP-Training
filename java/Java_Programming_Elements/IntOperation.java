package Java_Programming_Elements;

import java.util.Scanner;

public class IntOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input three integers
		System.out.print("Enter a (int): ");
		int a = sc.nextInt();

		System.out.print("Enter b (int): ");
		int b = sc.nextInt();

		System.out.print("Enter c (int): ");
		int c = sc.nextInt();

		// Perform operations (considering precedence)
		int result1 = a + b * c; // Multiplication (*) has higher precedence than addition (+)
		int result2 = a * b + c; // Same precedence (* before +), left-to-right
		int result3 = c + a / b; // Division (/) has higher precedence than addition (+)
		int result4 = a % b + c; // Modulus (%) has same precedence as division (/), then addition (+)

		// Print results
		System.out.println(
				"The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

		sc.close();

	}
}
