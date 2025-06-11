package day1;
import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		System.out.println("Area of a circle:"+3.14*radius*radius);
		sc.close();
		}
}
