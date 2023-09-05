import java.util.Scanner;

public class NullPointerFix {

	public static void main(String[] args) {

 //		int i = null; //cannot be assigned to primitive dt, but can to objects
		
//		String a = null; // a = null: null
//		System.out.println(a.length()); // java.lang.NullPointerException

		System.out.println("enter a number: ");
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.nextInt()); //method nextInt on scan object is pointing to nothing
	
	
	}

}
