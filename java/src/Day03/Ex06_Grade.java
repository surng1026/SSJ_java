package Day03;

import java.util.Scanner;

public class Ex06_Grade {

	public static void main(String[] args) {
		//학점을 입력받아, 점수 구간을 출력하시여.
		// A :90 ~ 100점입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("학점 :");
		//ㄴ\string (문자열) 참조 자료형
		//실수(float, double) 조건값으로 불가능
		String grade = sc.next();
		switch (grade) {
		case "A" : System.out.println("90~100점입니다"); break;
		case "B" : System.out.println("80~89점입니다"); break;
		case "C" : System.out.println("70~79점입니다"); break;
		case "D" : System.out.println("60~69점입니다"); break;
		case "F" : System.out.println("60점 미만입니다"); break;
		default : System.out.println("A~F 사이의 문자를 입력해주세요."); break;
			
		}
		sc.close();
		
	
	
	
	}
		
	
	}

