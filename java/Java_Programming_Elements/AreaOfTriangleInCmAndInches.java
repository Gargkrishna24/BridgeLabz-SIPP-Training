package Java_Programming_Elements;
import java.util.Scanner;
public class AreaOfTriangleInCmAndInches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        int height = sc.nextInt();    
        System.out.print("Enter base in cm: ");
        int base = sc.nextInt();    
        float areaInCm = (float)(0.5 * base * height); 
        float areaInInches = (float)(0.5 * base * height * (1/2.54));  
        System.out.println("Area in square cm: " + areaInCm);
        System.out.println("Area in square inches: " + areaInInches);
        sc.close();
    }
}