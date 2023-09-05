import java.util.ArrayList;

public class ForEachLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String cars [] = {"Vitara", "Aveo", "Corsa"};
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("-------------------");
		for (String car : cars) { // for( char car : cars) //other type
			System.out.println(car);
		}
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(9);
		numbers.add(4);
		
		for (int a : numbers) {
			System.out.println(a);
		}
		
		System.out.println("-------------------");
		
		for(int j = 0; j < numbers.size(); j++) { //method: size
			System.out.println(numbers.get(j));  //method: get()
		}
	}

}
