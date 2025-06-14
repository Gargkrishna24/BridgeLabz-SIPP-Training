package Java_Programming_Elements;
import java.util.Scanner;
public class DistanceInYardAndMiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distanceInFeet = sc.nextInt();
		System.out.println("The distance in yards is "+ ((distanceInFeet/3)/1760)+" while the distance in miles is "+distanceInFeet/3);
	}
}
