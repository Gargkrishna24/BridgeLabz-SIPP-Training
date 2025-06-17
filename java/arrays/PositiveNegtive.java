package arrays;

public class PositiveNegtive {
	public static void main(String[] args) {
		
		int[] array = new int[]{12,34,22,56,17,12};
		int firstElement = array[0];
		for(int i = 0 ; i <  array.length;i++) {
			if(array[i]==0) System.out.println("Zero");
			else if(array[i]<0) System.out.println("Negative");
			else {
				if(array[i]%2==0) {
					System.out.println("Even");
				}
				else {
					System.out.println("Odd");
				}
				if(firstElement == array[array.length-1]) {
					System.out.println("First and last element are equal");
				}else System.out.println("Not Equals");
			}
		}
	}
}
