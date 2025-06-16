package Java_Programming_Control_Flow;
import java.util.Calendar;
import java.util.Scanner;
public class SpringSeason {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter month (1-12): ");
    int month = sc.nextInt();

    System.out.print("Enter day (1-31): ");
    int day = sc.nextInt();
	boolean isSpring = false;
	 if ((month == 3 && day >= 20 && day <= 31) ||
	            (month == 4 && day >= 1 && day <= 30) ||
	            (month == 5 && day >= 1 && day <= 31) ||
	            (month == 6 && day >= 1 && day <= 20)) {
	            isSpring = true;
	            
	 }
	 if (isSpring) {
         System.out.println("Yes, it is Spring season!");
     } else {
         System.out.println("No, it is not Spring season.");
     }

     sc.close();
	}
}
