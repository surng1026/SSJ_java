package Day08.Ex03_멀티Catch;

import java.util.Scanner;

public class 멀티Catch {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			
			
			char[] char1 = str1.toCharArray(); //String ->char[]변환
			char[] char2 = str2.toCharArray(); //"10" [1][0]
			
			//char1   ['1']['0']
			//input1  ["1"]["0"]
			String[] input1 = new String[char1.length];
			String[] input2 = new String[char1.length];
			for (int i = 0; i < char2.length; i++) {
				input1[i] = char1[i] + "";
			}
			for (int i = 0; i < input2.length; i++) {
				input2[i] = char2[i] + "";
			}
			
 		
			try {
				System.out.println(input1[0] + input1[1]);
				System.out.println(input2[0] + input2[1]);
				
				int value1 = Integer.parseInt(str1);
				int value2 = Integer.parseInt(str2);
				int result = value1 + value2;
				System.out.println(str1 + " + " + str2 + " + " + result);
			} 
			catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
				System.err.println("숫자로 변환할 수 없는 값입니다. (문자를 입력한 경우)");
				System.err.println("접근할 수 없는 배열 index 범위입니다. (한자리수만 입력한 경우)");
			}
			
			catch (Exception e) {
				System.err.println("이 외에 알 수 없는 예외 발생");
			}
			
			sc.close();
		
		
		
	}
	
}
