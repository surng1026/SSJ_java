package JavaMission;

import java.util.Scanner;

//정수 하나를 입력 받아, 정수형 변수 N에 초기화시키고,
//예시 <출력>과 같이 “*” 기호를 출력하는 프로그램을 작성하시오.

public class JavaMission4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N의 값: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        
        
        
        sc.close();
    }
}
