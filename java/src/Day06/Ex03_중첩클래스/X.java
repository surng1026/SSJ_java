package Day06.Ex03_중첩클래스;

/**
 * 중첩클래스
 */


public class X {
	
	int xValue = 1;
	static int xValue2 =2;
	
	//인스턴드 이너 클래스
	class Y{
		int value;
		static int value2 = 100;
		
		Y() {
			System.out.println("X의 Y객체 생성");
			System.out.println("value2 : " + value2);
		}
		void method() {
			System.out.println("Y의 메소드");
			System.out.println("Y에서 X클래스의 static 변수 접근" + xVaLue2);
			
		}
	static void method2() {
		System.out.println("Y의 static 메소드");
	}
	
	//static 이너 클래스
	//static 이너 클래스에서는 static 멤버 사용가능
	static class Z {
		int value1;
		static int vaLue2;
		
		Z() {
			System.out.println("X의Z객체 생성");
		void method1() {
			System.out.println("Z의 메소드");
		static void method2() {
		System.out.println("Z의 static 메소드");
		}
	void method() {
		//로컬클래스
		
		class L {
			int value;
			static int value2;
			
			L() {
				System.out.println("L의 객체 생성");
			}
			void method() {
				System.out.println("L의 메소드");
			static void method2() {
				System.out.println("L의 static 메소드");
				
			}
			}
			L 1 = new L();
			1.value = 10;
			System.out.printIn("로컬 클래스의 L의 변수" + 1.value);
			1.method();
		}
	}
	
	
	
	
	}
	
	}
}
