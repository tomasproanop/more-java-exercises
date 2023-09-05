
public class ThisTut {
	
	int a;
	int b;
	
	String food;
	char size;
	
	public void setData(String food, char size) {
		this.food = food;
		this.size = size;
	}
	
	public void setData(int a, int b) {
		
		//this para qu eno confunda los de arriba. o arriba
		//nombrarles c y d. 
		
		this.a = a; //this does not work with static
		this.b = b;
		
	}

	public static void main(String[] args) {

		ThisTut t = new ThisTut();
		
		t.setData(4,3); //t. porque ya no es static
		t.setData("spaghetti", 'L');
		
		System.out.println(t.a);
		System.out.println(t.b);
		
		System.out.println(t.food);
		System.out.println(t.size);
	}

}
