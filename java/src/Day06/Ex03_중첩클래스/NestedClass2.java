package Day06.Ex03_중첩클래스;

public class NestedClass2 {

	
	public static void main(String[] args) {
		
		//X
		//Y :인스턴스 이너 클래스
		//Z : static 이너 클래스
		//method
		//L : 로컬 클래스
		
		X x =new X();
		
		//인스턴스 이너 클래스 객체 생성
		X.Y y = x.new Y();
		y.value =10;
		System.out.println("Y객체의 변수 : " + y.value);
		y.method1();
		y.method2();
		
		// static 이너 클래스 객체 생성
		X.Z z= new X.Z();
		z.value1 =20l
				System.out.println("X의 객체 변수 :" + z.value1);
		
		X.Z.value2 = 30;
		System.out.println("X의 Z객체의 static 변수 " + X.Z.vlLue2);
		z.method1();
		X.Z.method2();
		//로컬 클래승 객체 생성을 위한 메소드 호출
		x.method(); //내부에서 L객체 생성
	}
}
