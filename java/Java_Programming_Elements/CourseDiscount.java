package java_programming_elements_level1;

public class CourseDiscount {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        double discount = fee * discountPercent / 100.0;
        double finalFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount + 
                         " and final discounted fee is INR " + finalFee);
    }
}