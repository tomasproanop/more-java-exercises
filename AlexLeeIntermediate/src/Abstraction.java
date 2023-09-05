//implement: interface
//Extend: classes


//abstract method is method still not implemented. 


//interface: can't have implemented methods
//abstract clasS: can have both abstract method and implemented methods 
//inside abstract classes.

abstract class Dog{


	public void bark() {
		System.out.println("bark");
	}
	
	public abstract void poop(); {} // just idea, method not implemented
	// does not know what to do
}

class Chihuahua extends Dog{
	
	public void poop() {
		System.out.println("dog pooped");
	}
	
}

public class Abstraction {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Chihuahua c = new Chihuahua();
			
			c.poop();
			c.bark();
			
	}

}
