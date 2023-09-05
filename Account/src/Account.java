
public class Account {
	
	String name;
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		
//		a.age = 34;
//		a.name = "Bicho"; // sin getters y setters
		
		//con getters y setters
		a.setName("Bicho"); //queremos pasar el parametro "bicho"
		a.setAge(7);
		System.out.println(a.getName());
		System.out.println(a.getAge());
		
		a.printDetails();
	}
	
	//getters and setters
	//con s se puede pasar parametros, como esta hecho arriba
	//getter: get the variable
	
	public void setName(String name) {
		this.name = name; //this account's name, not the parameter
	}
	
	public void setAge(int age) {
		this.age = age; //
	}
	
	public String getName() {
		return this.name;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public void printDetails() {
		System.out.println(name + ", " + age);
	}
}

//tb hay una funcionalidad de eclipse: 
//source: generate getters and setters. 