//obj are made from the classes

//final keyword means it does not change.

public class ClassesInfo {
	
	 static int x = 2;
	 
	 void printHi(){ //won'T return anything
			 System.out.println("hi!");
	 }
	
	//this class knows variable x

	public static void main(String[] args) {

		ClassesInfo c = new ClassesInfo();
		
		System.out.println(x);
		c.printHi();
	}

}
