//class inside of a class

class Outside {
	
	int a = 0;
	
	class Inside{
	
		int b = 5;
	}
	
}

public class InnerDemons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Outside o = new Outside(); //object
		Outside.Inside i = o.new Inside(); //object inside object
		System.out.println(o.a + " " + i.b);
		
		//si Inside es static: 
		// Outside.Inside i = new Outside.Inside();
	}

}
