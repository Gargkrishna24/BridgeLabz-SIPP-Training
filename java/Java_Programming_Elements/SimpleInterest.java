package Java_Programming_Elements;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt();
		int time = sc.nextInt();
		int rate = sc.nextInt();
		System.out.println("Simple Interset : "+ (principal *rate*time)/100);
		
	}
	

}
