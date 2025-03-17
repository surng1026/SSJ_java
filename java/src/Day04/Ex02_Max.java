package Day04;

import java.util.Iterator;
import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		
		
		//첫번쨰 줄에 입력할 개수N을 입력받고
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		//N 개의 정수 중, 최댓값을 구하시오.
		//(입력)
		//5
		//90 60 70 100 55
		//(출력)
		// 최댓값 : 100
		
		//순서도
//		1.냄비에 물을 넣는다. 정수 하나르 ㄹ입력받아서 N에 대입
//		2.물을 끓인다.      N개의 요소를 갖는 배열 arr 선언 및 생성
//		3.스프를 넣는다.     N번 반복하면서 정수를 입력받아서 배열arr에 순서대로 대입
//		4.면을 넣는다.      배열을 반복해서 최댓값 max를 배열 i번쨰 요소랑 비교
//		5.               두 요소 중에서 더 큰 요소를 max 에 대입
//		6.               반복 끝나고, max를 출력
//		이걸 모르겠다구요 문법이 이해가 안대유
//		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =sc.nextInt();
			
			
		} 
			//Integer.MIN_VALUE : -21억xxx : int의 최솟값
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if( max < arr[i] ) {
				max = arr[i];
			}
		}
		System.out.println("최댓값 : " + max);
		
		sc.close();
		
		
	}
}
