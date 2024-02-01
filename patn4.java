class patn4{
	public static void main(String[] args) {
		int row =  3;
		int space =2;
		int star = 1;
		
		for (int j=1;j<=row ;j++ ) {
			for (int i=1;i<=space ;i++ ) {
			System.out.print("  ");
			}
			for (int k=1;k<=star ;k++ ) {
			System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
			star+=1;
		}
	}	
}
/*

  *
 ***
*****


*/