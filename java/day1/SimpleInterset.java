package day1;
import java.util.Scanner;
public class SimpleInterset {
	public static void Main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt();
		int rate = sc.nextInt();
		int time = sc.nextInt();
		System.out.println("Simple Interset ="+ (principal * rate * time)/100);
	}

}
