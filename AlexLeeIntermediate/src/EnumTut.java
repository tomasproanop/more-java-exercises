
enum Level{ //cleaner
	
	LOW, MEDIUM, HIGH; //uppercase
}

public class EnumTut {
	
	//enum can inside or outside a class. 
	//enum does not have types, just labels. 
	
	public static void main(String[] args) {
		
		Level l = Level.LOW;
		
		System.out.println(Level.HIGH);
		
		
		switch(l) {
		
		case LOW:
			System.out.println("low level");
			break;
		case MEDIUM:
			System.out.println("medium level");
			break;
		case HIGH:
			System.out.println("high level");
			break;
		}

	}

}
