package Day08.Ex02_다중Catch;

import java.util.Iterator;
import java.util.Scanner;

public class 다중Catch {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//입력 받고 
			String str1 = sc.nextLine();//90
			String str2 = sc.nextLine();//80
			//변수 설정

			// 배열
			char[] char1 = str1.toCharArray(); //String ->char[]변환 "90" [9][0]
			char[] char2 = str2.toCharArray(); //"80" [8][0]
			
//			String의 toCharArray() 메소드:
			
//			toCharArray() 메소드는 String 객체를 char[] 배열로 변환하여
//			각 문자를 배열의 원소로 만듭니다.
//			이를 통해 문자열 내의 각 문자를 처리할 때 더 세밀하게 다룰 수 있습니다.
			// 이 과정을 통해서 String에 입력받은 두자리 숫자를 나눌 수 있음 ex)19 = [1] [9]
			
			//char1   ['9']['0']
			//input1  ["9"]["0"]
			String[] input1 = new String[char1.length];
			String[] input2 = new String[char2.length];
			//여기서 다시 배열를 설정하고 
			
			//반복문을 사용
			for (int i = 0; i < char1.length; i++) {
				input1[i] = char1[i] + "";
			}
			for (int i = 0; i < char1.length; i++) {
				input2[i] = char2[i] + "";
			}
			
			//예외가 발생할 가능성이 있는 문장을
			try {
				System.out.println(input1[0] + input1[1]);
				System.out.println(input2[0] + input2[1]);
				
				int value1 = Integer.parseInt(str1);
				//interger는 괄호 안의 자료형을 바깥의 형태로 바꿔줌
				int value2 = Integer.parseInt(str2);
				int result = value1 + value2;
				System.out.println(str1 + " + " + str2 + " = " + result);
			} 
			//예외 처리를 요로케 해서 출력할거임
			catch (NumberFormatException e) {
				System.err.println("숫자로 변환할 수 없는 값입니다. (문자를 입력한 경우)");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("접근할 수 없는 배열 index 범위입니다. (한자리수만 입력한 경우)");
			}
			catch (Exception e) {
				System.err.println("이 외에 알 수 없는 예외 발생");
			}
			
			sc.close();
			
		}
}
