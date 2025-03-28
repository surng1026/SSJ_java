package Day14.Serialization;

import java.io.Serializable;

//직렬화
//Serializable 인터페이스를
//	구현해야 직렬화 객체를 정의할 수 있다
	
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4179293278542339089L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1321723705258690642L;
	private String name;
	private int age;
	//변수추가
//	private String adress;
	
	
	public Person() {
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
