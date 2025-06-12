package java_programming_elements_level1;
import java.util.Scanner;
public class PoundsToKilogram {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int pound = sc.nextInt();
			double a = 2.2;
			double weight = pound / a;
			
			System.out.println("the weight of the person in pounds is " + pound +" and in kg is "+ weight);

		}
}
