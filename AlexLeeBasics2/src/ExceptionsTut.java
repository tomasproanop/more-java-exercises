
public class ExceptionsTut {

	public static void main(String[] args) {
		String pets [] = {"dog", "cat", "monkey"}; // [3]
		try {
		System.out.println(pets[3]);
		}
		catch (Exception e) {
			System.out.println("hey, the index is out of bounds! :(");
		}
	}

	//range, null pointer, InvalidTypeException, ArithmeticException
}
