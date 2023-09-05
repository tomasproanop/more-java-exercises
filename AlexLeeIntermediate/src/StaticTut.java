
public class StaticTut {
	
	//global variables: que varios metodos los usen!
	
//	int a = 0;
	
	static int a = 5;
	static int months = 12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.out.println(a); //error: change a to static

		int b = 15;
		
		System.out.println(a + b);
		
		System.out.println(months);
		
		//without static, we need to create an object
		//that's the advantage of using static
		
//		StaticTut s = new StaticTut();
//		System.out.println(s.a);
		 // so statictut has access to a
		
	}

}
