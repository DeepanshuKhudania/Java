import java.util.Arrays;
import java.util.Scanner;

public class Scnr {

	public static void main(String[] args) {
		int []arr = new int [5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<arr.length;i++) {
			System.out.println("Please enter your number");
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
