import java.util.HashSet;

import java.util.Iterator;

public class HashSetProgram {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();
		
		h.add("lemur");
		h.add("orangutan");
		h.add("spider monkey");
		
		//h.remove("lemur");
		//h.clear);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.contains("lemur"));
		
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(1);
		numbers.add(123);
		numbers.add(4);
		

		
		//turn into array and look for index
		Object createObj [] = numbers.toArray();
		System.out.println(createObj[1]);
		
		System.out.println(numbers.hashCode());
		//hashCode() returns an integer value
		//generated by a hashing algorithm.
		
		System.out.println("-------------------------------");
		
		Iterator<Integer> ite = numbers.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		

		
		
		
	}

}
