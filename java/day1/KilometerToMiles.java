package day1;
import java.util.Scanner;

public class KilometerToMiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kilometer = sc.nextInt();
		
		System.out.println("Miles="+ kilometer *0.621371);
		sc.close();
	}
}
