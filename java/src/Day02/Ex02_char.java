package Day02;

public class Ex02_char {
	
	public static void main(String[] args) {
		// 문자 데이터 : char
		// *작은 따옴표 ''를 한 글자의 문자를 표현
		// 리터럴 (literal)
		// : 소스 코드에 표기하는 데이터 (숫자인지, 문자인지 문자열인지 의미를 부여)
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
				
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
				
		int unicode = c1;
		
		char b = (char) (c2 + 1);
		// (c2 + 1) ??   c2 = char  + 1 = int  (char) + (int) =
		//작은 자료형과 큰 자료형을 연산하면, 그 결과는 큰 자료형이 된다.
		//(작은 자료형) + (큰 자료형) = (큰 자료형)
		//(c2 + 1) : char + int = int (자동 형 변환)int를 더 작은 개념인 char에 넣을 수 없음
		// b = (c2 + 1) : (char) = (char)<추가 (int) 실행가능 (강제 형 변환)
		
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
		System.out.println("c6 : " + c6);
		System.out.println("A의 코드값 : " + unicode);
		//System.out.println("b : " + b);

	
	
	}

}
