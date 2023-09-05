import java.util.Scanner;

class HelloInput {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Hi! What is your name? " );
		String name = scanner.nextLine();

		System.out.printf("Nice to meet you, %s. How old are you? ", name);
		int age = scanner.nextInt(); //tb opcion parseInt https://youtu.be/A74TOX803D0?t=5471

		scanner.nextLine(); // enter en buffer. 

		System.out.printf("%d is a great age to learn programming. What is your preferred language? ", age);
		String language = scanner.nextLine();

		System.out.printf(" %s is a cool language :)", language);
		
		scanner.close();
		
		System.out.println();
	}
}