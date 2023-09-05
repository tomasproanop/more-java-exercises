
public class BreakeStatement {

	public static void main(String[] args) {

		int i = 0;
				
		while(i < 3) {
		
			System.out.println("Hi");
			i++;
			break; // sale 1 vez y no 3
			
		}
		
		int numbers [] = {1,2,3,4,5};
		
		for(int j = 0; j < numbers.length; j++) {
			if(numbers[j] == 3) { //print hasta 2
				break;
			}
			System.out.println(numbers[j]);
		}
		
		int k = 5;
		
		switch(k) {
		case 0: 
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		default:
			System.out.println("wtf");
			break;
		}
		
		for (int m = 0; m < 5; m++) {
			
			for (int n = 0; n < 3; n++) {  //empieza en cero!!!!!
				System.out.println(m + ", " + n);
			}
		}
	}

}
