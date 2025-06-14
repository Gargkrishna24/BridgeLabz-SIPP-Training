package Java_Programming_Elements;

import java.util.Scanner;

public class InteractiveCourseDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter course fee: ");
        int fee = input.nextInt();
        System.out.print("Enter discount percentage: ");
        int discountPercent = input.nextInt();
        
        double discount = fee * discountPercent / 100.0;
        double finalFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount + 
                         " and final discounted fee is INR " + finalFee);
        input.close();
    }
}