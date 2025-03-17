
package Day04;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for (int i = 1; i < results.length; i++) {
            if (results[i] > maxResult) {
                maxResult = results[i];
            }
        }

        // 결과 출력 (소수점 이하 6자리까지)
        System.out.printf("%.6f\n", maxResult);
		
		
		
		sc.close();
		}
		
	}

