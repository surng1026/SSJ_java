package Day09.Ex02_Wrapper;


public class DoubleEx {
	
	public static void main(String[] args) {
		// Double
		// double -> Double
		// : 실수타입인 double 기본타입을 객체화한 클래스
		Double d = 3.14; //AutoBoxing
		System.out.println( d.toString() + 0.06 );				// 실수형 -> 문자열
		System.out.println( Double.parseDouble("3.14") + 0.06 );// 문자열 -> 실수형
		
//		double a = null; 불가능 -기본 타입은 null 불가
//		Double b = null; null은 참조자료형으로만 사용가능
		// 1330 - 1530
	}

}


