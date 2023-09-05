import java.util.Arrays;

public class Tuts {

	
	public static void main(String[] args) {
		//for loop
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print("ja");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// if else
		
		int temperatur = 6;
		
		if (temperatur < 7) {
			System.out.println("toma la biela");
		}
		
		else if (temperatur == 7){
			System.out.println("opti");
		}

		else {
			System.out.println("nooo");
		}
		
		System.out.println();
		
		// arrays
		
		int [] schrank = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(schrank));
		
		System.out.println("wert an position 1: " + schrank[0]);
		
		int laenge = schrank.length;
		System.out.println("Länge: " + laenge);
		
		schrank[2] = 10;
		
		System.out.println("wert an position 3: " + schrank[2]);
		
		System.out.println(Arrays.toString(schrank));
		
		System.out.println();
		
		//string array
		
		String [] hallo = new String [4];
		// mit "new" kann man arrays fester länge initialisieren.
		
		hallo[0] = "hallo,";
		hallo[1] = "du";
		hallo[2] = "bist";
		hallo[3] = "Bicho!";

		for (int i = 0; i < hallo.length; i++) {
			System.out.println(hallo[i] + " ");
		}
		
	}
	
	}
