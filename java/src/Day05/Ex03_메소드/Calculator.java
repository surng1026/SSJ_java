package Day05.Ex03_메소드;

/**
 * 계산기
 * 피연사자를 2개로 하는 계산기
 * 기능
 * 덧셈 정수 2개를 덧셈
 * 뺄셈 정수 인자1 -인자2 연산을 하는 뺄셈
 * 곱셈 실수 2개를 곱셈
 * 나눗셈 실수 인자1/ 인자2 연산을 하는 나눗셈
 * 나머지 정수 인자1 % 인자2 연산을 하는 나눗셈
 * 합계 배열로 매개변수를 전달받아, 모든 요소의 합계를 구함
 * 평균 배열로 매개변수를 전달받아, 모든 요소의 평균을 구함
 * 
 * 메소드명
 * plus, minus, multiple, divde, remain, sum, avg
 */




public class Calculator {

	
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}
		
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}
			
	public double multiple(double a, double b) {
		double result = a * b;
		return result;
	}
				
	public double divide(double a, double b) {
		double result = a / b;
		return result;
	}

	public int remain(int a, int b) {
		int result = a % b;
		return result;
	}
	
	public int sum(int[]arr) {
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public double avg(int[] arr) {
		int sum =sum(arr);
		double avg = (double) sum(arr) / arr.length;
		return avg;
	}
	
	
			
	
}

