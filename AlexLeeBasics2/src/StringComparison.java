
public class StringComparison {

	public static void main(String[] args) {

		String a = "Cielo";

		String b = "Cielo";

		if (a == b) {
			System.out.println("zi, true");
		} else {
			System.out.println("sorry, false");
		}

		String aa = new String("BichOOO");
		String bb = new String("bichooo");

		if (aa.toLowerCase().equals(bb)) {
			System.out.println("zi, true");
		} else {
			System.out.println("sorry, false");
		}
	}

}
