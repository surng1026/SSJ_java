package Day03;

public class Ex10_whileSum {

	public static void main(String[] args) {
		
//		1부터 1000까지 합계를 구하시오.
//		1+2+3 ..+999+1000 =???
		
		int a = 1;
		int sum = 0;
		while (a <= 1000) {
//			sum = sum +a;
//			a = a + 1;
			//방법 1
//			sum = sum + a++;
//			방법2
			
			sum += a++;
//			방법3
		
		}
		System.out.println(sum);
	}
}
