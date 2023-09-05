//source -> generate Getters and Setters

public class Account {
	
	//attributes
	String name;
	int age;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new object
		
		Account a = new Account();
		
		a.setName("Elmo");
		a.setAge(56);
		System.out.println(a.getName()); //get name
		System.out.println(a.getAge()); //get age
		
		a.printDetails();
	}
	
//	public void setName(String name) { //accessed through the class, so we don't need static
//		this.name = name;//this account's name 
//		
//	}
//	
//	public void (String name) { //accessed through the class, so we don't need static
//		this.name = name;//this account's name 
//		
//	}
	

	
	
	public void printDetails() {
		System.out.println(getName() + ", " + getAge());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
