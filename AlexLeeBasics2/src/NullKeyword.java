
public class NullKeyword {

	public static void main(String[] args) {

		// refers to nothing
		//only works with Strings and objects (e.g. arrays)
		
		String a = null;
		
		if(a == null) {
			System.out.println("a is null!");
		}
		
		if(a.equals(null)) { //cannot run a method if it's null!!!1 EXC
//			Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "a" is null
//			at NullKeyword.main(NullKeyword.java:15)
			System.out.println("it's null, another method");
		}
		
		
	}

}
