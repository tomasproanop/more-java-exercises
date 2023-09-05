import java.util.ArrayList;

public class ArrayListPro {

	public static void main(String[] args) {
		
		String fruits [] = new String[3]; //create new array and set length
		fruits[0] = "mango";
		fruits[1] = "apple";
		fruits[2] = "orange";
		System.out.println(fruits[1]);
		
		//more flexible instead of gibberish
		ArrayList fruitList = new ArrayList(); 
		fruitList.add("mango");
		fruitList.add("apple");
		fruitList.add("orange");
		fruitList.add("watermelon");
		fruitList.remove("apple");
		//fruitList.clear();
		System.out.println(fruitList.contains("banana"));
		System.out.println(fruitList);
		
	}

}
