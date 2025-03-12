package Day03;

import java.util.Scanner;

public class Ex08_switchYield {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	System.out.println("정수 입력 : ");
	int num =sc.nextInt();
	
	String result = switch (num % 5) {
	case 0,1 -> "*"; //yield 반환값;
	
	default -> {
		System.out.println("별 2개");
		yield "**";
		

	}
	
	};
	
	System.out.println(result);
	
	String result2;
	switch (num % 5) {
	
	case 0, 1: result2 = "*"; break;
	default: result2 = "**"; break;
	}
	System.out.println(result2);
	
	sc.close();

	}
}
