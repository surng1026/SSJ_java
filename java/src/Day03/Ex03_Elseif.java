package Day03;

import java.util.Scanner;

public class Ex03_Elseif {

	public static void main(String[] args) {
//		성적을 입력받아서, 성적에 따른 학점A~F를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 : ");
		int score = sc.nextInt();
		char grade = 'F';
		//if
		//90점 이상, A
		//80점 이상, B  
		//70점 이상, C 
		//60점 이상, D
		//60점 미만, F
		
		if( score >= 90 && score <=100 ) { 
			System.out.println("A");

		}
		if( score >= 80 && score < 90 ) { 
			System.out.println("B");
		}
		if( score >= 70 && score < 80 ) { 
			System.out.println("C");
		}
		if( score >= 60 && score < 70 ) { 
			System.out.println("D");
		}
		if( score < 60 && score > 0 ) { 
			System.out.println("F");
		}
		
		if( score >= 90 && score <= 100 ) 
			grade = 'A';
		else if( score >= 80 ) 
			grade = 'B';
		else if( score >= 70 ) 
			grade = 'C';
		else if( score >= 60 ) 
			grade = 'D';
		else grade = 'F';
		System.out.println("학점 :" + grade);
			
			
		sc.close();
	}
}
