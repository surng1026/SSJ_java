package 단축키;

import java.util.Scanner;

//학생5 명의 JAVA 프로그래밍 성적을 입력 받아,
//1차원 배열에 저장하고
//성적을 기준으로 오름차순, 내림차순으로 각각 출력하시오.
// (단, 정렬 방식은
// 선택정렬, 버블정렬, 삽입정렬 중 하나의 정렬방식을 이용하시오.
// 성적은 정수 0 이상 100 이하로 주어집니다.)
// (조건)
// JAVA API에서 제공되는메소드는이용하지않는다.
 
public class Mission7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생1의 성적 : ");
			int a = sc.nextInt();
			System.out.println("학생2의 성적 : ");
			int b = sc.nextInt();
			System.out.println("학생3의 성적 : ");
			int c = sc.nextInt();
			System.out.println("학생4의 성적 : ");
			int d = sc.nextInt();
			System.out.println("학생5의 성적 : ");
			int e = sc.nextInt();
		
		
		sc.close();
		System.out.println("ㅇㅇ"+ a + b + c + d+ e);
	}
}
