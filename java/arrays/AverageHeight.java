package arrays;
import java.util.Scanner;
public class AverageHeight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] heights = new double[11]; 
		double sum = 0;
		System.out.print("Enter the heights of the person: ");
		for(int index = 0 ; index < heights.length;index++) {
			heights[index]=sc.nextDouble();
			sum = sum +heights[index];
		}
		double mean=sum/heights.length;

		System.out.println("mean :"+mean);
	}

}
