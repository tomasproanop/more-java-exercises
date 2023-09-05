
public class RecRec {

	public static void main(String[] args) {	
		sayHi(5);
		
		System.out.println("--------------------------------");
		countBackwards(13);
	}
	
	public static void sayHi(int n) {
		if (n==0) {
			System.out.println("done!");
		} else {
			System.out.println("hi");
			n--;
			sayHi(n);
		}
	}
		
	public static void countBackwards(int n) {
		if (n == 0) {
			System.out.println("done!");	
		} else {
			System.out.println(n);
			n--;
			countBackwards(n);
		}
	}
		
		
	}

	//needs a base case to avoid stack overflow
