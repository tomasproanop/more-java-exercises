
public class Pen {
	
	//Attr.
	
	String type = "gel";
	String color= "blue";
	int point = 10;
	
	
	//actions)
	static boolean clicked = false;
	
	public static void click() {
		clicked = true;
	}
	
	public static void unclick() {
		clicked = false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen pen1 = new Pen();
		
		System.out.println(pen1.clicked); // variable
		System.out.println(pen1.point);
		System.out.println(pen1.type);
		
		System.out.println(pen1.clicked); //Variable
		
		
		
	}

}
