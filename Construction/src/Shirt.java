
public class Shirt {
	
	public static String color; //private: only inside obj knows color

	public static char size;
	
//	Shirt() {
//		System.out.println("inside constructor");
//	}
//	
	// cuando no esta esto, de usa el dafault constructor. 
	
	//constructor: 
	Shirt() {
		
	}
	
	//another constructor:
	
	Shirt(String newColor, char newSize) {
		color = newColor;
		size = newSize;
	}
	
	public static void putOn() {
		System.out.println("shirt on");
	}
	
	public static void takeOff() {
		System.out.println("shirt off");
	}
	
}

