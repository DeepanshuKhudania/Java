
import java.util.Arrays;
class Sort{
	public static void main(String[] args) {
		int [] arr = {40,20,50,10,30};
		System.out.println("before sort: "+ Arrays.toString(arr) );

		for (int i=0;i<arr.length-1 ;i++ ) {
			for (int j = i+1; j<arr.length ;j++ ) {
				if (arr[i]>arr[j]) {
					int temp = arr [i];
					arr[i] = arr [j];
					arr[j]= temp;


					
				}
				
			}
			
		}
		System.out.println("after sort: "+ Arrays.toString(arr));
	}

	
}