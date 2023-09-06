
public class TellPosition {
	
	static int tellP(String[] words, String word) {
		int output = -1;
		
	for (int i =0; i < words.length; i++) {
		if(words[i].equals("Test")) {
			System.out.println("skipping lines");
		continue;
	}
	
	if(words[i].equals(word)) {
		output = i;
		break;
	}
	
	System.out.println("blabla");
	
	}
	
	return output;

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = new String[2];
		
		words [0] = "horse";
		words [1] = "bunny";
		words [0] = "dog";
		
		tellP(words, "cat");
	}
}