package Day03;

import java.util.Scanner;

public class Ex07_switchBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 :");
		int num = sc.nextInt();
		//입력 받는 정수를 5러 나눈 나머지가
		//2보다 작으면 "*"출력
		//그렇지 않으면 "**"출력
//			-SWITCH 문을 이용하시오.
		
		switch(num % 5) {
		//case 0, 1, 2:
		case 0 :
		case 1 :System.out.println("*"); break;
		case 2 :
		case 3 :
		case 4 :System.out.println("**"); break;
		default: 
			break;
		
		}
		
		
	sc.close();
		
	}
}
