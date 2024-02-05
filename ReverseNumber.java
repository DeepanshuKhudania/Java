class ReverseNumber{
	public static void main(String[] args) {
	int num = 321;
	System.out.println(num);
	int out= 0;
	while(num>0 ){
		int rem= num%10;
		out = out*10+rem;
		num=  num/10;
	}
	System.out.println(out);

	}

}