//toString
public class Student {
	
	int studentID;
	String name;
	
	Student (int studentID, String name) { //metodo con parametros
		this.studentID = studentID;
		this.name = name;

	}
	
	//create tostring method
	//gibberish sin esto!!!
	
	public String toString() {
		return studentID + ", " + name;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(1, "Brutus");
		Student s2 = new Student(2, "Mensus");
		Student s3 = new Student(3, "Nulus");
		
		 
		System.out.println(s1);
		System.out.println(s2); 
		System.out.println(s3);
		
		/// metodo oficial: 
		
		System.out.println(s2.toString());
		
	}

}
