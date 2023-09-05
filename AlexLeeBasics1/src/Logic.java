
public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// &&, ||, !
		boolean a = !(false);
		
		System.out.println(a);
		
		int one = 1;
		int two = 2;
		
		boolean boo = (one > two) && true;
		
		System.out.println(boo);
		
		boolean isSunny = true;
		boolean amHappy = false;
		if (!(one < two && isSunny) || !(amHappy)) {
			System.out.println("it's gonna be a good day!");
		}
		
		
	}

}
