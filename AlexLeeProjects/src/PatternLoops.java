
public class PatternLoops {

	public static void main(String[] args) {

		for(int i = 0; i <= 5; i++) { //row
			
			for(int j = 0; j < i; j++) { //column
				System.out.print("*");
			}
				
			System.out.println("*");				

		}
		
		for (int i = 4; i >= 0; i--) {
			
			for(int j = 0; j < i; j++) { //column
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
