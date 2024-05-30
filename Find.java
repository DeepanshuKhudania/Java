class Find{
public static void main(String[] args) {
	
	int [] number = {10,20,30,60,70};
	int find = 30;

	boolean yes= false;

	for (int x:number ) {
		if (x == find) {
			System.out.println("find element");
			yes= true;
			break;
		}
	}if (yes == false) {
	System.out.println("Element not found");	
	}
	
}

}