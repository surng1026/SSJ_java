package Day08.Ex01_TryCatch;
/**
 * 예외처리
 * NumberFormatException
 * 문자열 숫자("10")가 아닌 문자열을 숫자타입으로
 *  변환 시 발생하는 예외 상황
 * "10A" ->숫자변환시 예외
 * "10"-> 10
 * 
 */
public class NumberFormat {

	
	public static void main(String[] args) {
		String strNum = "10";
		int num =10;
		//strNum +20
//		String +int
		//string +string =string
//		+ 문자열 연결 연산자
		System.out.println("10 + 20 = " + (strNum + 20));
		// + 산술 연산자
		System.out.println("10 + 20 = " + (num + 20));
	
	String numberString = "10";
	String numberAndString = "A10";
	
	//integer.parseInt("문자열숫자")
	//문자열 숫자를 int타입의 숫자로 변환하는 메소드
	int num1 = Integer.parseInt(numberString);//integer를 썼으므로 숫자는 숫자
	System.out.println("numberString + 5 =" + (numberString +5));
	
	int num2 =0;
	
//	int num2 = Integer.parseInt(numberAndString);
//	System.out.println("num1 + 10 =" + (num1 +10));
//	System.out.println("num2 : " + (num2));//숫자가 아닌 문자가 있으므로 실행불가
//	
	
	try {
		num2 = Intenger.parseInt(numberAndString);
		
	} catch (NumberFormatException e) {
		System.out.println("문자열숫자가 아닌 문자열을 숫자타입으로 변환할 수 없습니다.");
		
	}
	
	System.out.println("num1 + 10 = " + (num+10));
	System.out.println("num2 = " + (num2));
	}
}
