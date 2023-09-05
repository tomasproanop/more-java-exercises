
public class EnumTut2 {
	
	//Works the same even if enum is inside the class
	
	//enum stands for enumeration. 
	//methods can be inside the enum:

	
	
	enum Flavor {
		CHOCOLATE, VANILLA, STRAWBERRY;
		
		public static void getVanilla() {
			System.out.println(Flavor.VANILLA);
		}
		
	}

	public static void main(String[] args) {
		
		Flavor flav = Flavor.VANILLA;
		
		if (flav == flav.VANILLA) {
			System.out.println("it's vanilla");
		} else if  (flav == flav.CHOCOLATE) {
			System.out.println("it's chocolate");
		} else if  (flav == flav.STRAWBERRY) {
			System.out.println("it's strawberry");
		}
		
		flav.getVanilla(); //prints: VANILLA

	}

}
