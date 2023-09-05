import java.util.LinkedList;
import java.util.Queue;

public class QueueTut {

	public static void main(String[] args) {
		// Think of a BBQ
		
		Queue<String> bbqLine = new LinkedList<String>();
		
		bbqLine.add("Jackson");
		bbqLine.add("Susan");
		bbqLine.add("Eleftheria");
		
		System.out.println(bbqLine);
		
		System.out.println(bbqLine.poll()); //take out of line
		
		System.out.println(bbqLine);
		
		System.out.println(bbqLine.peek()); 
		
		System.out.println(bbqLine);
		
		System.out.println("----------------------");
		Queue<String> q = new LinkedList<String>();
		
		q.add("A");
		q.add("B");
		q.add("C");
		
		System.out.println(q);
		
		System.out.println(q.toArray()[1]); //get elem from array
		
		//size, contains, 
	}

}
