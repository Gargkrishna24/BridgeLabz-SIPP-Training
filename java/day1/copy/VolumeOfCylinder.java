package day1.copy;
import java.util.Scanner;
public class VolumeOfCylinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		int height = sc.nextInt();
		System.out.println("Volume of a Cylinder :"+ 3.145*radius*radius*height);
	}
}
