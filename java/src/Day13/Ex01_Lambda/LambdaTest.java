package Day13.Ex01_Lambda;

/**
 *  익명 객체 
 *  익명 자식 개체
 *  익명 구현 객체
 *  
 *  익명 함수
 */
//익명 자식 객체의 부모 클래스 정의

class Television {
	void volumnUp() { System.out.println("UP");}
	void volumnDown() { System.out.println("Down");
}
	//익명 구현 객체의 인터페이스 정의
	interface RemoteControl {
		void volumnUp(); 
		void volumnDown();
	}
	//익명 함수를 위한 함수형 인터페이스 정의
	@FunctionalInterface
	interface Calculator {
		int calc(int a, int b);
	}
}

public class LambdaTest {
	public static void main(String[] args) {
		//익명 자식 객체
		Television tv = new Television() {

			@Override
			void volumnUp() {
				System.out.println("UP - 자식");
				super.volumnUp();
			}

			@Override
			void volumnDown() {
				
				System.out.println("Down - 자식");
				super.volumnDown();
			}
			
		};
		tv.volumnUp();
		tv.volumnDown();
		//익명 구현 객체
		RemoteControl rc = new RemoteControl() {
			
		};
		//익명 구현 객체2
		Calculator cal = new Calculator() {
			
		};
		//익명 함수 (람다식)
		Calculator calLambda = (a , b ) -> { return a + b;};
		int result2 = calLambda.calc(30,40);
		System.out.println("result2 : " + result2);
	}
}
