package java_programming_elements_level1;
import java.util.Scanner;
public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstElement = sc.nextInt();
		int secondElement = sc.nextInt();
		 int temp = firstElement;
		 firstElement = secondElement;
		 temp = secondElement;
		 System.out.println("firstElement: "+firstElement+"secondElement"+secondElement);
		
		
		sc.close();
	}
}
