package Day08.Ex02_다중Catch;

import java.util.Iterator;
import java.util.Scanner;

public class 다중Catch2씹뜯맛즐 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			
			
			char[] char1 = str1.toCharArray(); //String ->char[]변환
		
			
			char[] char2 = str2.toCharArray(); //"10" [1][0]
			
			//String의 toCharArray() 메소드:
			
//			toCharArray() 메소드는 String 객체를 char[] 배열로 변환하여
//			각 문자를 배열의 원소로 만듭니다.
//			이를 통해 문자열 내의 각 문자를 처리할 때 더 세밀하게 다룰 수 있습니다.
			// 이 과정을 통해서 String에 입력받은 두자리 숫자를 나눌 수 있음 ex)19 = [1] [9]
			
			//char1   ['1']['0']
			//input1  ["1"]["0"]
			
			String[] input1 = new String[char1.length];
			String[] input2 = new String[char2.length];
			
			for (int i = 0; i < char1.length; i++) {
				input1[i] = char1[i] + "";
			}
			for (int i = 0; i < char1.length; i++) {
				input2[i] = char2[i] + "";
			}
			
			System.out.println(input1[0] + input1[1]);
			System.out.println(input2[0] + input2[1]);
			
			sc.close();
			
		}
}
