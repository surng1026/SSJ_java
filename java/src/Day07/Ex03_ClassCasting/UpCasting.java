package Day07.Ex03_ClassCasting;

public class UpCasting {

	
	public static void main(String[] args) {
		//업캐스팅(자동 타입 변환)
		// (부모클래스) = (자식클래스)
		// 자식 객체를 부모 클래스타입으로 변환하는것
		Person person = new Student("김조은", 20 ,1, "문예창작과");
		
		//Person :name, age
		//Student name,, age, grade, major
		System.out.println("name : + " + persen.name);
		System.out.println("age : + " + persen.name);
	
		//Person 객체에서는 자식 클래스의 변수인 grade, major 에는 접근할 수 없다.
		//sysout
		//sysout

		//클래스를 업캐스팅하면
		// 변수는 부모 클ㄹ래스의 변수만 접근 가능하거
		//메소드는 자식 클래스의 메소드가 우선하여 실행된다.
		System.out.println(person);
		System.out.println(person.work());
		
		//이유 : 변수는 정적 바인딩, 메소드는 동적 바인딩
//		바이딩 (biding)
		//프로그램에서 사용되는 요소에 실제 값을 결정 짓는 행위
		
		//정적 바인딩 컴파일 시간에 결정 ->변수
//		  동정 바인딩 실행 시간에 결정 -> 메소드
		
		
		//
	}
	
}
