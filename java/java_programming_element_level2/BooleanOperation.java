package java_programming_element_level2;
import java.util.Scanner;
public class BooleanOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input three doubles
		System.out.print("Enter a (double): ");
		double a = sc.nextDouble();

		System.out.print("Enter b (double): ");
		double b = sc.nextDouble();

		System.out.print("Enter c (double): ");
		double c = sc.nextDouble();

		// Perform operations (same precedence rules, but with floating-point division)
		double result1 = a + b * c; // * before +
		double result2 = a * b + c; // * before +
		double result3 = c + a / b; // / before +
		double result4 = a % b + c; // % before +

		// Print results
		System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3
				+ ", and " + result4);

		sc.close();
	}
}
