class FifthPattern{
	public static void main(String[] args) {
	int row = 5;
	int space = 2;
	int star = 1;
	
	for (int i=1; i<=row ;i++ ) {
		for (int s=1;s<=space ;s++ ) {
			System.out.print("  ");
		}
		for (int j=1;j<=star ;j++ ) {
			System.out.print("* ");
		}
		System.out.println();
		if (i<=row/2){
			star++;
			space--;
		}else {
			star--;
			space++;
			}
		
		}
		
	}

}