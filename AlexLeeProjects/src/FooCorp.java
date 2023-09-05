
public class FooCorp {
	
	public static void payment(int hours) {

	int wage = 8;
	int overtimeWage = 12;
		
	int regularPay = 40 *wage;
	int overtimePay = (hours - 40) * overtimeWage;
	
	if (hours <= 40) {
	System.out.println(regularPay);
	
	} else {
		
		int totalPay = regularPay + overtimePay;
	
		System.out.println(totalPay);
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		payment(41);
			

	}

}
