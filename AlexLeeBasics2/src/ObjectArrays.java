class Cat{
	
	String type = "Bicho";
	
	public static void sayMiau() {
		System.out.println("miau!");
	}
		
}

public class ObjectArrays {

	public static void main(String[] args) {
	
		Cat bicho = new Cat();
		Cat cielo = new Cat();
		Cat cevi = new Cat();
		
		Cat cats [] = {bicho, cielo, cevi};
	
		
		for(Cat c : cats) {
			c.sayMiau();
		}
		
		int nums [] = {1,2,3,4,5};

	}

}
