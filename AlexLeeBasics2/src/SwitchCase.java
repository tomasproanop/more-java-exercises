
public class SwitchCase {

	public static void main(String[] args) {

		//switch case numbers
		int day = 9;
		
		//if
		
//		if (day == 0) {
//			System.out.println("Sunday");
//			
//		} else if (day == 1) {
//			
//			System.out.println("Monday");
//			
//		} else if (day == 2) {
//			System.out.println("Tuesday");
//			
//		} else if (day == 3) {
//			System.out.println("Wednesday");
//		}
		
		switch(day) {
		
		case 1: 
			System.out.println("Sunday");
			break;
		case 2:  
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Not a valid day number!");
		}
		
		//switch case strings
		
		String cat = "mixed race";
		
		switch(cat) {
		case "siamese":
			System.out.println("white");
			break;
		case "american shorthair" :
			System.out.println("grey");
			break;
		case "tortoiseshell":
			System.out.println("tricolor!");
			break;
		default:
			System.out.println("don't know which color!");
		}
	}

}
