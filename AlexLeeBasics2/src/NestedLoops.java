
public class NestedLoops {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("it's so warm outside!");
		}

		System.out.println("-----------------------");

		String colors[] = { "red", "blue", "green" };

		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}

		System.out.println("-----------------------");

		String fancyColors[][] = { { "red", "blue", "green"}, { "turquoise", "cyan", "magenta"} };

		for (int row = 0; row < 2; row++) { // 2 rows
			for (int column = 0; column < 3; column++) { // 3 columns!!!!!!!
				System.out.println(fancyColors[row][column]); //rows and columns
			}
		}
		
		System.out.println("-----------------------");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				
				System.out.println("i: " + i + ", j: " + j);
				
			}
		}

	}

}
