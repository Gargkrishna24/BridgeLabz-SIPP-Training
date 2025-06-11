package day1.copy;
import java.util.Scanner;
public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float celsius = sc.nextFloat();
		float fahrenite = (celsius*(9/5))+32;
		System.out.println("Fahrenite"+fahrenite);
		sc.close();
	}
}
