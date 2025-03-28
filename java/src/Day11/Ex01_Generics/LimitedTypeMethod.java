package Day11.Ex01_Generics;



public class LimitedTypeMethod {

	public <T extends Number> void method(T t) {
	
		System.out.println(t.intValue());
		System.out.println(t.doubleValue());
	}
	public static void main(String[] args) {
		LimitedTypeMethod ltm = new LimitedTypeMethod();
		ltm.<Integer>method(1234);
		ltm.<Double>method(12.34);
		
		//(에러)
		//문자열을 Number 클래스의 자식 클래스가 아니므로 에러발생
//		ltm.<String>method("12.34");
	}
	
}
