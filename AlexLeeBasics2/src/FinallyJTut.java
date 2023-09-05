import java.util.Scanner;

public class FinallyJTut {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		try {
			
			System.out.println(scan.next());
//			int a = 5 / 0;
			
		} catch (Exception e){
			
//		System.out.println("Ups! Something went wrong!");
		System.out.println(e);
			
		} finally {
			
			scan.close();
//			System.out.println("Finally says: The End");
			
		}
		
	}

}
