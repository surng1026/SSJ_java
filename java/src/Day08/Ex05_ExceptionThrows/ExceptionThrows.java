package Day08.Ex05_ExceptionThrows;

import java.util.Scanner;

public class ExceptionThrows {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			input();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.err.println("정수를 입력해주세요.");
		}
	}
		//예외전가 (예외 던지기; 예외 떠넘기기) throws
		//예외 처리에 대한 책임을 메소드를 호출한 곳으로 떠넘기는 것
	
		public static void input() throws InputMismatchException {
			System.out.print("입력: ");
			int input =sc.nextInt(); //예외 발생 가능성 코드
			System.out.println(input);
		
		
		
		
	}
}

