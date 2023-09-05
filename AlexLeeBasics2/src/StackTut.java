import java.util.Stack;

public class StackTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//adds from the top down
		
		Stack<String> games = new Stack<String>();
		
		games.add("Prince of Persia"); //goes first
		games.add("Commander Keen"); 
		games.add("Billy The Kid"); //goes first
		
		System.out.println(games); //prints array
		
		System.out.println(games.peek()); // (lo muestra al elem pero no lo bora
		
		System.out.println(games); //prints array
		
		System.out.println(games.pop()); //remove top

		
		System.out.println(games); //prints array
		
		System.out.println("---------------------");
		
		Stack<Character> tower = new Stack<Character>();
		
		tower.add('R');
		tower.add('B');
		tower.add('Y');
		
		System.out.println(tower.peek()); //Y
		
		System.out.println(tower.contains('P')); 
		
		System.out.println(tower.empty()); 
		
		System.out.println(tower.get(0)); 
		System.out.println(tower.get(1)); 
		System.out.println(tower.get(2)); 
		
		System.out.println(tower.set(1, 'P')); 
		
		System.out.println(tower); 
		
		System.out.println(tower.size()); 


		

		
	}

}
