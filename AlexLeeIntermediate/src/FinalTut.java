//final vs normal: you can't change the final variable. 
// variables, metodos clases pueden ser final!!!!!!!!
//no se puede aplicar extend!!!!!!


public class FinalTut {
	
	//global variables
	
	final int MAX = 5; 
	final int MIN = 0;
	static final double PI = 3.14159;
	
	final public void hi() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		
		FinalTut f = new FinalTut();
		f.hi();
	}

}
