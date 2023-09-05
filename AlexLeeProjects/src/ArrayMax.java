
public class ArrayMax {
	
	public static int getMinIndex(int values []) {
	
	int minValue = Integer.MAX_VALUE;
	int minIndex = -1;
	
	for (int i = 0; i < values.length; i++) 
		if (values[i] < minValue) {
			minValue = values[i];
			minIndex = i;
		}
	return minIndex;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int testArray [] = {3,2,1};
		
		System.out.println(getMinIndex(testArray));
		// minimum value is at index 2. 

	}
	

}
