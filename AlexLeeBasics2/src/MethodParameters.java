
public class MethodParameters {

	public static void main(String[] args) {

		sayHi();
		sayBicho("Bicho");
		
		printInfo("Bicho", 6);
		printInfo("Cielo", 6);
		printInfo("Mina", 12);
		printInfo("Pomposo", 14);
		
		System.out.println(add(4,5));
		
		int result = add(6,6);
		
		System.out.println(result);
	}

	public static void sayHi() {
		
		System.out.println("hi");
	}
	
	public static void sayBicho(String s) {
		System.out.println(s);
	}
	
	public static void printInfo (String name, int age ) {
		//pass 2 param to the method
		System.out.println("In 2023, " + name + " is " + age + " years old.");
	}
	
	public static int add(int a, int b) {
		return a + b;
	}

}
