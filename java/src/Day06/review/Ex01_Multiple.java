package Day06.review;

import java.util.Scanner;

public class Ex01_Multiple {

	//main ctrl+ cpace
	//프로그램 실행시, 가장 먼저 실행 되는 메소드
	public static void main(String[] args) {
		//정수 하나를 입력받아서
		//입력 받는 수가 3의 배수인지 아닌지,
		//판단하고 그 여부를 출력하는 프로그램을 작성하시오.
		// 3의 배수 0 : "3의 배수입니다."
		// 3의 배수 x : "3의 배수가 아닙니다."
		
		//1 정수입력
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//2. 3의 배수인지 판단
		if( N % 3 ==0) {
			System.out.println("3의 배수입니다.");
			
		}
		else {
			System.out.println("아니유");
		}
	sc.close();
	}
}
