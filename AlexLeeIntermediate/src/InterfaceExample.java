interface WaterBottleInterface {
	
	//outside of main methods
	String color = "blue";
	
	void fillUp();
	void pourOut();
	
}
public class InterfaceExample implements WaterBottleInterface {

	public static void main(String[] args) {

		System.out.println(color);
		
		InterfaceExample ex = new InterfaceExample();
		
		ex.fillUp();
		ex.pourOut();
		
		
	}

	
	//automatically added
	
	@Override //implemments whatever is in the interface
	public void fillUp() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void pourOut() {
		// TODO Auto-generated method stub
		
	}

}
