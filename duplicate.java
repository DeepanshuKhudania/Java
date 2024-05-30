class Duplicate{
	public static void main(String[] args) {
		int [] arr = {10,20,30,20,10,40,50,70};
		int num = 10;

		int count = 0;

		for (int x : arr ) {

			if (x== num) {
				count++;	
			}
		} System.out.println(count);
	}
}