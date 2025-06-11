package day1;
import java.util.Scanner;
import java.lang.Math;
public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int exponent = sc.nextInt();
		int base = sc.nextInt();
		System.out.println("Power:"+(Math.pow(base,exponent)));
		sc.close();
	}
}
