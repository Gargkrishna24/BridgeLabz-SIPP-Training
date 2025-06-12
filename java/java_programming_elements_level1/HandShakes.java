package java_programming_elements_level1;

import java.util.Scanner;

public class HandShakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        
        int handshakes = n * (n - 1) / 2;
        System.out.println("Maximum number of possible handshakes: " + handshakes);
        input.close();
    }
}