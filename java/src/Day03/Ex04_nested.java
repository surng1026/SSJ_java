package Day03;

import java.util.Scanner;

public class Ex04_nested {

	public static void main(String[] args) {
		//정보처리기사 합격 기준
		//*응시자격: 대학교 4학년
		// 점수 : 60점 이상
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학년 : ");
		int year = sc.nextInt();
		System.out.println("점수 : ");
		int score = sc.nextInt();
		
		
		

		if( year != 4) {
			System.out.println("응시자격이 없습니다.");}
			else if( score >= 60) {
				System.out.println("합격");}
			else  {
					System.out.println("불합격");}
			
		
	//합격
		//불합격
		//응시자격이 없습니다.
		
		//응시자격이 있는 경우에만 입력받기
		int 학년 = sc.nextInt();
		if( 학년 != 4 ) {
				System.out.println("응시자격이 없습니다.");
		}
		else {
			int 점수 = sc.nextInt();
			if( 점수 >=60) {
			 System.out.println("합격");
			}
			else {System.out.println("불합격");}
			}
		
		
	//응시자격이 있는 경우에만 점수 입력 + 중첩if문 없애기
		if( 학년 != 4) {
			System.out.println("응시자격이 없습니다.");
			return;} //<-프로그램을 종료
		
			System.out.println("점수 : ");
			int 점수 = sc.nextInt();
			if( 점수 >= 60) System.out.println("합격");
			else  System.out.println("불합격");
		
		
		
		
		
		
		}

}

