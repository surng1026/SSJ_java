package Day04;

// enum 열거타입  정의
//열거타입 enum은 파이롤로 정의할 수있고,
// 클래스 파일 내부에서 정의할 수도 있다.

enum Test {A,B,C,D,E,F};

public class Ex07_Enum {

	public static void main(String[] args) {
		//enum열거타입
//		요소들을 명명한 값으로 집할을 이루는 자료형
//		특징
//		1.enum을 비교할 때는 값 뿐만아니라 타입도 비교한다,
//		2.enum 상수값이 재정의되도 다시 컴파일할 필요가 없다.
		
//		enum 관련 메소드
//		Values()    열거타입의 모든요소를 배열로 반환
//		ValuseOf()  전달된 문자열과 일치하는 열거타입  상수를 반환
//		ordanal()   해당 열가타입 상수가 정의된 순서를(index) 반환
		
		Rainbow[] rainbow = Rainbow.values();
		
		for (Rainbow color : rainbow) {
			System.out.print(color +" ");
			
		}
		System.out.println();
		Rainbow G = Rainbow.valueOf("PURPLE");
		System.out.println("G : " + G);
		
		int index = G.ordinal();
		System.out.println("PURPLE의 INDEX :" + index);
		
		
	}
}
