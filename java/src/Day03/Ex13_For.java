package Day03;

public class Ex13_For {
	public static void main(String[] args) {
		
//		for(1초기식 ; 2조건식 ; 4증감식) {3 실행문} 
//		실행순서 1 반복 2,3,4
//		i = 반복 변수
//		1, 1~10까지 정수를 출력하시오.
//		2.50~100까지 정수를 출력하시오
//		3.1~20까지 정수 중 짝수만 출력하시오.
//		4.1~20까지 정수 중 홀수만 출력하시오.
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
		}
	System.out.println();
	    for (int i = 1; i <=20; i++) {
	    	if ( i % 2 == 0 )
	    		System.out.print(i + " ");
	    	
	    }
	    System.out.println();
	    
	    for (int i = 1; i <=20; i++) {
	    	if ( i % 2 == 1 )
	    		System.out.print(i + " ");
	    	
	    }
	    System.out.println();
	    
		
	}
}
