// https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/

public class G4G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// arithmetic exception
		try {
			int a = 15, b = 0;
			int c = a / b; // cannot divide by zero
			System.out.println("result = " + c);
		}

		catch (ArithmeticException e) {
			System.out.println("cannot divide by zero!");
		}

		// NullPointer Exc

		try {
			String a = null;
			System.out.println(a.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("NullPointerException!");
		}
	}
}
