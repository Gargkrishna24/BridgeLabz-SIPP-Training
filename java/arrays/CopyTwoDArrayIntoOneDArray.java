package arrays;
import java.util.Scanner;

public class CopyTwoDArrayIntoOneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input dimensions of 2D array
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(); // rows
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt(); // columns

        int[][] array = new int[n][m];
        
        // Input elements for the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Create a 1D array to store all elements
        int[] oneDArray = new int[n * m];
        int index = 0;

        // Copy elements from 2D to 1D array
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                oneDArray[index] = array[i][j];
                index++;
            }
        }

        // Display 1D array
        System.out.println("1D array after copying:");
        for(int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
        sc.close();
    }
}
