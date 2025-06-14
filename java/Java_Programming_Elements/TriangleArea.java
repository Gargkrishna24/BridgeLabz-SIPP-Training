package Java_Programming_Elements;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base length: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is " + area + " square units");
        input.close();
    }
}