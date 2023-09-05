import java.util.HashMap;

public class HashMaps {
	//hasmaps don't have an order. Array has order instead (index!!)

	public static void main(String[] args) {

		HashMap<String, Integer> happy = new HashMap<String, Integer>();
		happy.put("a", 10);
		happy.put("b", 3);
		happy.put("c", 88);
		
		System.out.println(happy);
		System.out.println(happy.get("c"));
		
		HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("Alice B.", "Toklas14523");
		fun.put("Demeter", "OracleYay");
		fun.put("Cavafy", "DamnedCity");
		
		//fun.remove("Alice"); removes user and password
		
		System.out.println(fun);
		
//		check if hashmap contains value
		
		System.out.println(fun.containsKey("Alice B.")); 
		//boolean. value: pass, key: user
		
		System.out.println(fun.containsValue("AgathaChristie4234")); 
		

		System.out.println(fun.replace("Alice B.", "Sappho"));
		//replaces password (key,value)
		
		System.out.println(fun); //show after changes
		
		System.out.println(fun.values()); //passwords
		
		System.out.println(fun.keySet()); //users
	}

}
