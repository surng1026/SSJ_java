package 단축키;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

//정수N을 입력받아 N개의 게임의 로또번호를 출력하시오. 
//즉, 6개의 배열요소를 갖는 1차원 배열을 선언하여
//1~45 사이의 랜덤한 값을 중복되지 않도록 저장하고
//출력하는 과정을 N번 반복하시오.
public class Mission6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력: ");
		int N = sc.nextInt();
		
		
		Random random = new Random();
		
		
		for (int i = 0; i < N; i++) {
			//for문으로 로또 게임의 횟수를 생성함
			int[] arr = new int[6];//배열 값 지정
		
		
			Set<Integer> o2 = new HashSet<>();//이건 객체임
		
			int count = 0;
			
			while (count < 6) {
				//6보다 값이 작을때 
			int num = random.nextInt(45) + 1;
			//random.nextInt(45)는 0~45 미만의 숫자를 생성하니까 +1을 해서 45를 맞춰줌
			o2.add(num);
			//생성된 숫자를 o2에 넣어준뒤
//			새로운 숫자가 추가될때까지 while은 반복
//			여기서 o2는 set객체로 지정했으니까 중복이 되지 않음.
			if (o2.size() == count +1) {
				//이 조건문에서는 set.o2에 저장된 숫자의 개수를 반환해서
//				중복되지 않은 유효한 숫자가 추가 되었을때 count +1이 됨
				arr[count] = num;
				//배열 arr의 count번째 위치에 랜덤으로 생성된 num값을 저장함
				count++;
				//count를 1증가시켜 다음 위치에 값을 넣을 수 있게함
//				(배열의 인덱스를 증가시키며 랜덤값 저장)
			} //while과 if에서 로또 번호를 중복 없게 뽑아냄
			
			
		}
			Arrays.sort(arr);
		
		
	System.out.println("로또번호 : " + Arrays.toString(arr));
	
	}
		sc.close();
	}
}
