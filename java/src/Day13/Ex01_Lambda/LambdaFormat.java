package Day13.Ex01_Lambda;


/**
 * 람다식 사용하기
 * 1.함수형 인터페이스 정의
 * 	@FuntionanlInter 어노테이션 지정
 * 람다식 익명함수를 정의하여 인터페이스에 선언,
 * 람다식 호출
 */


interface FuncInterface1{
//	@FuncIterface1{지정 시, 추상메소드가 없거나 2개 이상이면 에러발생
		void method();
		
interface FuncInterface2{
}	void method(String a, String b);
interface FuncInterface3{
}
interface FuncInterface4{
}

	public class LambdaFormat {
		//매개변수 X, 반환타입X 람다식
		public static void main(String[] args) {
			FuncInterface1 fi1 = ( ) -> sysout "자바 람다식1"
			fi1.method();
			
		//매개변수 O, 반환타입 X 람다식
//			(a,b) ->{sysout (a+b)};
			FuncInterface2 fi2 = (a, b) -> {
				String result = a+b;
				System.out.println(result);
				
				//매개변수X, 반환타입O 람다식
				//() ->{return 1+2;
			FuncInterface3 fi3= () ->{
				String a = "자바";
				String a = "람다식3";
				return a + b;			
				
			};
			String result3 = fi3.method();
			System.out.println(result3);
			
			//매개변수O,반환타입O 람다식
			FuncInterface2 fi4 = (a, b) ->{ return a + b; };
			//(에러)FuncInterface4 fi5 = (a, b) ->return a+b ; ;
			// return문만 있을 땐,
//			{} 생략불가
			FuncInterface6 fi6 =fi4.method("자바", "람다식4");
			System.out.println(result4);
			System.out.println(result6);
			
		}
	
	
	
	
	}
}
