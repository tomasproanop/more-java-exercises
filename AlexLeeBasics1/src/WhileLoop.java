import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		int a = 0;
		
	//	while(a<10) {
//			System.out.println("a is less than 10:  "+ a);
	//		a++;
	//	}
		
		//this is the same than
		
	//	for (a=0; a < 10; a++) {
	//		System.out.println("a is less than 10:  "+ a);
	//	}
			
		//infinite loop
//			do {
//				System.out.println(a);
//			}
//			
//			while(a == 0);
		
		//stores each word of a sentence in an array list with a scanner. 
		
		String sentence = "cats are awesome!";
		Scanner scan = new Scanner(sentence);
		ArrayList<String> words = new ArrayList<String>();
		
		while(scan.hasNext()) {
			words.add(scan.next());
		}
				
		System.out.println(words);	
		
		//----------------------------------------------------------------
		
		
		
		
			
	}

}
