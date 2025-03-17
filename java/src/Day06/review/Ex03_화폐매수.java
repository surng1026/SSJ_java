package Day06.review;

import java.util.Scanner;

/**
 * 우리 학원에서 고건우님께서거액의 예산을 주고 전자렌지를 구매하라고 지시하였다.
 * 이 때 전자렌지를 구매비는 다음과 같이 현금으로 지급한다.
 * 구매비 : 657862
 * 50000 :13
 * 10000 :0
 * 5000  :1
 * 1000  :2
 * 500   :1
 * 100   :3
 * 50    :1
 * 5     :0
 * 1     :2
 * 위와 같이 입력하면,
 * 큰 화폐단위부터 계산하여, 화펴 단위 별로 화폐매수를 출력하는 프로그램을 작성하시오.
 */
public class Ex03_화폐매수 {

	public static void main(String[] args) {
		/*
		 * 순서도
		 * 1.필요한 변수 선언
		 * 입력금액, 화폐매수가 몇장인지, 화폐단위
		 * 2.구매비 입력
		 * 3.화폐매수 계산
		 * 657862 / 50000 = 13.xxx = int
		 * 3-1화폐매수 계산
		 * 화폐매수 = 입력금액 / 화폐단위
		 * 3-2 잔액 계산
		 * 657862 - 50000*13 = 7862
		 * 잔액 = 입력금액 - 화폐단위*화폐매수
		 * 잔액 = 입력금액 % 화폐단위
		 * 3.3 화폐단위 변환
		 * 50000 / 5 = 10000
		 * 10000 / 2 = 5000
		 * 5000  / 5 = 1000
		 * 1000  / 2 = 500
		 * 번갈아가면서 /5, /2 연산을 반복
		 * 4.3번 과정을 반복
		 * 화폐단위가 1원이 될때까지.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매비 : ");
		int input = sc.nextInt(); //입력금액
		
		int count = 0;     //화폐매수
		int money = 50000; //화폐단위
		boolean sw = true;
		
		
		while(money >= 1) {
		count = input / money;
		System.out.println(money + "\t\t: " +count + "개");
		
		input = input - (money*count);//잔액계산
		
		if(sw)money = money / 5;
		else money = money / 2;
		sw = !sw;
		
		}
	
		sc.close();
	}
}
