
class Student {

	String name;
	int grade;
	

	public String getName() {
		return name;
	}



	public Student setName(String name) {
		this.name = name;
		return this;
	}



	public int getGrade() {
		return grade;
	}



	public Student setGrade(int grade) {
		this.grade = grade;
		return this; //asi puedo chainear!!!!!!!! s.setGrade(99).setName("Gdee");
	}



	public static void main(String[] args) {
		
		Student s = new Student();
		s.setGrade(99).setName("Bob");
		
		System.out.println(s.name);
		System.out.println(s.grade);
		
	}

}
