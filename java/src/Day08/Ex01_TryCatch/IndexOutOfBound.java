package Day08.Ex01_TryCatch;


/**
 * 예외 처리
 * indexOutOfBound
 * 배열이나 문자열의 index 를 벗어나는 경우 발생하는 예외
 * 
 */
import java.util.Scanner;

public class IndexOutOfBound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 요소의 개수 : ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		System.out.println("접근할 index : ");
		int index = sc.nextInt();
		
		System.out.println("입력할 값 : ");
		int input = sc.nextInt();
		
		
		//예외 메시지 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
//		at java/Day08.Ex01_TryCatch.IndexOutOfBound.main(IndexOutOfBound.java:22)
		//예외상황 배열의 인덱스 범위를 초과하여 접근하는 경우
		
		try {
			arr[index] = input;
			System.out.println("arr[" + index + "] :" + arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 index의 범위를 초과하여 접근하였습니다.");
			System.err.println("(0~" + (N-1) +") 사이에 정수 범위에서 입력해주세요.");
		}

	
	sc.close();
	}
	
}
