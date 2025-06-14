package java_programming_elements_level1;
import java.util.Scanner;
public class FahrenheitTwoCelsius {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("temp. in fahrenheit: ");
	int a =	sc.nextInt();
	int b = (a-32)* (5/9);
	System.out.println(b);
	}
}
