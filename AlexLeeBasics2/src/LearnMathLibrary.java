
public class LearnMathLibrary {

	public static void main(String[] args) {

		System.out.println(Math.class);
		System.out.println(Math.E); 
		System.out.println(Math.PI); 
		System.out.println(Math.abs(-3.2)); 
		System.out.println(Math.acos(.54)); //between -1 and 1, arc cosine
		System.out.println(Math.addExact(3,4)); //eliminiates round errors 
		System.out.println(Math.cbrt(9)); //cube root
		System.out.println(Math.ceil(6.2)); //round up 
		System.out.println(Math.copySign(4,-5)); // takes sign from 2nd number and puts it on 1st
		//decrementExact: self-explanatory :)
		//floor: rounds down
		//floorDiv: div and take value to the floor
		System.out.println(Math.max(3,6)); //max of 2 val 
		//min
		//multiply: eso -> throw exception if value overflows!!!
		//negateExact: - sign
		System.out.println(Math.pow(5,2)); 
		System.out.println(Math.random()); //between 0 and 1
		//rint: round int
		System.out.println(Math.round(5.499999)); 
		System.out.println(Math.scalb(3,2)); //3*2 to the power of 2 
		//signum: 90: positive -> 1, -5: negative -> -1, 0: 0
		
	
	}

}
