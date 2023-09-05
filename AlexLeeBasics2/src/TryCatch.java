import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		int a [] = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("what's your fav number?");

		
		try {
		System.out.println(a[6]);
		int n = scan.nextInt();
		System.out.println(n);
		}
		
		catch (ArrayIndexOutOfBoundsException e)  {
			System.out.println("Exception: out of bounds!");
		}	
		
		catch (InputMismatchException e)  {
			System.out.println("please enter a number");
		}
		
		catch(NullPointerException e) {
			System.out.println("array is null!");
		}
		catch(Exception e) {
			System.out.println("some other bad thing happened :(");
		}
	}
}

