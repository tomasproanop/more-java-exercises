
public class Headphone {
	
	String charge = "micro usb";

	String controls [] = {"power", "volume", "skip", "play/pause"}; 

	String color = "red/black";
	
	static boolean power = false;
	static int volume = 60;
	
	public static void powerOff() {
		power = false;
	}
	
	public static void powerOn() {
		power = true;
}
	
	public static void volumeUp() {
		volume++;
}
	
	public static void volumeDown() {
		volume--;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Headphone h = new Headphone();
		
		System.out.println(h.color);
		System.out.println(h.charge);
		System.out.println(h.volume--);
		System.out.println(h.volume--);
		System.out.println(h.volume--);
		
		h.volumeUp();
		
		System.out.println(h.volume);
	}

}
