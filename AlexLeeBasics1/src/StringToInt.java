
public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "102"; 
		String age = "age: 47";
	
		int n = Integer.parseInt("2");
		
		int m = 8;
				
		System.out.println(Integer.parseInt(s) + 4);
				
		System.out.println(n);
		
		System.out.println(Integer.toString(m));
		System.out.println(Integer.toString(m) + 1);
	
		
		age = age.replaceAll("\\D+","");
		int o = Integer.parseInt(age);
		System.out.println(o + 2);
	
		
		
		
		
	}

}
