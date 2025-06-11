package day1;
import java.util.Scanner;
public class AverageOfThreeNumber {
	
	
		public static void Main(String [] args) {
			Scanner sc = new Scanner(System.in);
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			int number3 = sc.nextInt();
			System.out.println("Average of two Number"+ (number1+number2+number3)/3);
		
			sc.close();
	}

}
