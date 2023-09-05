//returns boolean!!!

//checks relationship of one element with another.

interface Nest {
	public void build();
}

class Bird {

	public void sing() {
		System.out.println("sing");
	}
}

class Eagle extends Bird {
}

class Robin implements Nest {
	
}

public class MyObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyObject o = new MyObject();

		Eagle e = new Eagle();
		
		Robin r = new Robin();

		System.out.println(o instanceof MyObject); // true
		// checks if it is class, subclass or interface

		System.out.println(e instanceof Bird);
		//true, is subclass. 
		
		System.out.println(r instanceof Nest);
		
		

	}

}
