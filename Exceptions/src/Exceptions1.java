//General: 


//Know the exceptions and cases. then you can know which exception may come up ( /0-> arithmethic, for-loop: infinite loop, array: indexoutofbounds)
// gleitkommazahl: man kann durch 0 teilen, ohne eine Exception in der Console!
//keine {} in loops! 

//1. 

public class Exceptions1 {

	public static void durch(int[] z) {
		int i = 0;
		double d = 1.0;

		while (i <= z.length) {
			System.out.println(d / z[i]);
			i++;
		}

	}

	public static void main(String[] args) {
		int[] feld = { 1, 0, 2, 4, 6 };
		durch(feld);
	}
	
	//above output: 
	//Exception in thread "main" 1.0
	//Infinity
	//0.5
	//0.25
	//0.16666666666666666
	//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		at Exceptions1.durch(Exceptions1.java:9)
//		at Exceptions1.main(Exceptions1.java:18)
	

	
}

