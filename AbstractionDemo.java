abstract class Demo{
	abstract void storeData();
}
class Demo1 extends Demo{
	void storeData(){
System.out.println("Data is being store to MySQl Database server");
	}

}
class Demo2 extends Demo{
	void storeData(){
		System.out.println("Data is being store to Oracle database server");
	}
}
class Demo3 extends Demo{
	void storeData(){
	System.out.println("Data is being store to Mongo database server");	
	}

}
class Helperclass{
	static Demo getconnection(String type){
		if (type.equals("mysql")){
			return new Demo1();
		}else if (type.equals("oracle")){
			return new Demo2();
		}else {
			return new Demo3();
		}

	}

}
class AbstractionDemo{
public static void main(String[] args) {
	Demo d = Helperclass.getconnection("oracle");
	d.storeData();
		
	}	
}