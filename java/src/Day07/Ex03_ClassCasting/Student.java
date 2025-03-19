package Day07.Ex03_ClassCasting;

public class Student extends Person{

	int grade;
	String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int grade, String major) {
		super(name, age);
		this.grade = grade;
		this.major = major;
		
	}
	
	
	//getter,setter
	
	//toString
	
}
