import java.util.Scanner;

public class Modulus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(15%4); // 3
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number: ");
		int number = scan.nextInt();
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		}
		else {
			System.out.println(number + " is not a prime number.");
		}

	}
	
		static boolean isPrime(int numberAnalized) {
			
			if(numberAnalized <=1) {
				return false;
			}
			
			for(int i = 2; i <= numberAnalized/2; i++) {
				if((numberAnalized % i) == 0)
					return false;
			}
			
			return true;
	}

}
