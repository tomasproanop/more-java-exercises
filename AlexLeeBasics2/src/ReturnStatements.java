
public class ReturnStatements {
	
	//Return statements let you store the 
	//result of a method and store it in a variable

	public static void main(String[] args) {
		
	printMessage();
	
	// con void: add(4,5); no puede ser asignado a variable.
	//ahora si puede ser stored in a variable, porque method tiene return
	int sum = add(4,5); 
	System.out.println(sum);
	

	String gritar = caps("hola bicho!!!");
	System.out.println(gritar);
	
	int ourArray [] = giveArrayFromInts (1,2,3);
	System.out.println(ourArray[0]);
	System.out.println(ourArray[1]);
	System.out.println(ourArray[2]);
	
	}	

	//void means it doesn't store anything. return nothing:	
	
	public static void printMessage() {
			System.out.println("this is our first method!");
	}
	
	public static int add(int a, int b) { //int en vez de void
		//con void: System.out.println(a+b);
		return a+b;
	}
	
	public static String caps(String s) {
		return s.toUpperCase();
	}
	
	public static int[] giveArrayFromInts(int one, int two, int three) {
		int array[] = new int[3];
		array[0] = one;
		array[1] = two;
		array[2] = three;
		return array;
	}
}


