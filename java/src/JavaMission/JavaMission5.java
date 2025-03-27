package JavaMission;

import java.util.Scanner;

//다음과 같이, 치킨 메뉴판을 출력하고,
//메뉴번호를 입력하면,
//다음 <실행결과>와 같이 출력되는 프로그램을 작성하시오.
//
//
//• (조건)
//- do~while 문,
//switch 문,
//static 메소드 정의 및 호출을 반드시 사용하시오.
//- 정수1~3 입력 시, 해당 메뉴 이름과 주문안내 문구를 출력하시오.
//- 정수 0~3 이외의 번호를 입력하면,
//0~3 사이의 번호를 입력하도록 요청하는 안내문구를 출력하시오.
//- 정수 0 입력 시, 주문한 메뉴 개수와 주문완료 메시지를 출력하시오.

class ED {
    
    static void abra() {
        System.out.println("주문이 완료되었습니다.");
    }
}


public class JavaMission5 {

		public static void main(String[] args) {
			int menuNo = 0;				
			String menuName = "";		
			int count = 0;				
			
			Scanner sc = new Scanner(System.in);
			

			do {
				System.out.println("**** 치킨 메뉴판 ****");
				System.out.println("1. 황금올리브 반반한 치킨");
				System.out.println("2. 뿌잉클 치킨");
				System.out.println("3. 처갓집에서 호식이가 만든 치킨");
				System.out.println("0. 종료");
				System.out.print("메뉴 번호 : ");
				
				menuNo = sc.nextInt();
				
				
				if( menuNo == 0 ) break;
				
				switch (menuNo) {
					case 1: menuName = "황금올리브 반반한 치킨"; break;
					case 2: menuName = "뿌잉클 치킨"; break;
					case 3: menuName = "처갓집에서 호식이가 만든 치킨"; break;
				
					default: break;
				}
				
				// 유효성 검사
				// - 메뉴번호가 0~5번만 유효
				if( menuNo >= 0 && menuNo <= 3 ) {
					// 주문 개수 증가
					count++;
					System.out.println(menuName + "(을/를) 주문하였습니다.");
				}
				else {
					System.err.println("(0~3)번 사이의 번호를 입력해주세요.");
				}
				System.out.println();
			} while ( menuNo != 0 );
			
			System.out.println(count + "개의 상품이 주문되었습니다.");
			ED.abra();
			sc.close();
		}

	}
