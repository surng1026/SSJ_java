package Day01;

import java.util.Scanner;
// inport 외부 클래스를 포함시키기
// inport 패키지명.클래스명;
// inport 패키지명.클래스명;
public class Ex02_scanner {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		객체 생성 키워드 new
//		클래스타입 객체명 = new 클래스명();
//		scanner : 표준 입력 객체
		
		System.out.println("a : ");
		int a = sc.nextInt(); // nextInt() : 정수 하나를 입력받는 메소드
		System.out.println("a : " + a);
		sc.close();
		

//		Scanner 객체를 해제한 후에는 더 이상 입력을 받을 수 없다.
		
	}
}
