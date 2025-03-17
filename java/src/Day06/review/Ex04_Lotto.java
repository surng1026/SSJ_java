package Day06.review;

public class Ex04_Lotto {
	public static void main(String[] args) {
	

	//math.random : 0.xxxxx ~ 0.9xxxxx 사이의 난 수를 반환하는 메소드
	double random = Math.random();
	 System.out.println(random);
	 
	 //1~6사이의 정수 : 주사위
	 //(int) (Math.random() * 10)     :0~9
	 //(int) (Math.random() * 10) + 1 :1~10
     System.out.println("1~10 : " + (int) (Math.random() * 10) + 1);

     //(int) (Math.random() * 6)     :0~6
     //(int) (Math.random() * 6) + 1 :1~6
     int dice = (int) (Math.random() * 6 ) +1;
     System.out.println("주사위 : " + dice);

	//(공식) : (int) (Math.random() * [개수] ) + [시작숫자]
     
     // 1~20 사이의 랜덤수
     System.out.println("(1~20)");
     System.out.println((int) (Math.random() * 20) + 1);
     
     //-20~20사이의 랜덤수
     System.out.println("(-20~20)");
     System.out.println((int) (Math.random() * 41) - 20);
     
     //1~45사이의 랜덤수 6개를 배열에 저장하시오
	int lotto[] = new int[6];
	//중복제거
	//오름차순 정렬^^^^^^^
	for (int i = 0; i < lotto.length; i++) {
		lotto[i] = (int) (Math.random()* 45) +1;
	//(i-1) ~ 0
		for (int j = (i - 1); j >= 0; j--) {
			if(lotto[i] == lotto[j]) {
			i--;
			break;
			}
			
			}
		}
		
	
	
	
	for (int i : lotto) {
		System.out.print(i + " ");
	}
	System.out.println();
	}

}
