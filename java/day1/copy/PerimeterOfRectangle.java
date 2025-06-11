package day1.copy;
import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void Main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		System.out.println("Perimetr Of a rectangle = "+(2*length*breadth));
	}

}
