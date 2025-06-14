package Java_Programming_ControlFlow;
import java.util.Calendar;

public class SpringSeason {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);  // 0-based (Jan = 0)

        // Check if it's Spring (March, April, May)
        if (month >= 2 && month <= 4) {
            System.out.println("It's Spring season!");
        } else {
            System.out.println("It's NOT Spring season.");
        }
    }
}
