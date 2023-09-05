
public class ArraySqrtWhile{

	public static void main(String[] args) {

		int array []= new int [6];
		
		int i = 0;
		
		while (i < array.length) {
			
			array[i] = i;
			
			int squareRoot = array[i] * array[i];
			
			System.out.println(squareRoot);
			
			i++;
		}
		
	}

}
