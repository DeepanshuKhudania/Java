class Pattern8{
	public static void main(String[] args) {
		int row = 5;
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
			if (j<=row/2) {
			space--;
			star++;
			star+=1;
			}else{
				space++;
				star--;
				star-=1;
			}
		}
	}	

}


/*
	*
   ***	
  *****
   ***
    *
*/