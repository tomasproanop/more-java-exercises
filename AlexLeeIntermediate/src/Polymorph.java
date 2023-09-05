class Bird {
	
	
	public void sing() {
		System.out.println("tweet");
	}
}

class Robin extends Bird {
	
	
	public void sing() {
		
		System.out.println("tuitutiuit");
		//prioriza este vs el metodo de Bird
		
		
	}
	
}

class Pelican extends Bird {
	
	
	public void sing() {
		
		System.out.println("kwaaack");
		//prioriza este vs el metodo de Bird
		
		
	}
	
}


public class Polymorph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird b = new Bird();
		Robin r = new Robin();
		Pelican p = new Pelican();
		b.sing();
		r.sing();
		p.sing();
	}

}
