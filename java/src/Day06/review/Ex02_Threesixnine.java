package Day06.review;

public class Ex02_Threesixnine {

	
	public static void main(String[] args) {
		
		//정수 1~100 까지 수를 반복하여 출력하면서
		//해당  수가 3 또는 6 또는 9가 될 때는
		// 자리수마다 369가 되는 개수 만큼 정수 대신
		//*을 출력하는 프로그램을 작성하시오.
		//Ex)
		//13 : *
		//66 : **
		
		//순서도
		//1.정수 1~100 까지 출력
		
		for (int i = 1; i <= 100; i++) {
			//i : 1~100
			//ex) i : 16
			int ten = i / 10;
			//i를 10으로 나누면 소수점이 찍히고 int는 그걸 출력하지못하니까 가능
			int one = i % 10;
			//i를 10으로 나눈 나머지를 구하면 일의 자리를 구할 수 있음
			
			boolean ten369 = ten ==3 || ten ==6 || ten ==9;
			boolean one369 = one ==3 || one ==6 || one ==9;
		
			//boolean ten369 = (ten != 0 && ten % 3 ==0);
			//boolean one369 = (ten != 0 && ten % 3 ==0);
			
			if (ten369 && one369 )
				System.out.println("**");
			else if (ten369 || one369 )
				System.out.println("*");
			else System.out.println(i);
			
		}
		//2. 해당 수가 369가 몇 개인지 판단
		// 2-1 십의 자리수가 369인지 여부판단 A
		// 2-2 일의 자리수가 369인지 여부판단 B
		// 3.369 개수에 따라 출력
		// A and B **
		// A or B  *
		// 그외      정수
		   
		
		
		
		
	}
}
