package java_programming_element_level2;
import java.util.Scanner;
public class PrintQuotientAndRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOne = sc.nextInt();
		int numberTwo = sc.nextInt();
		int quotient = numberOne/numberTwo;
		int remainder = numberOne%numberTwo;
		System.out.println("O/P => The Quotient is "+quotient+"and Reminder is "+remainder+" of two number"+ numberOne+" and+" +numberTwo);
	}

}
