package Day07.Ex01_익명객체;

public interface RemoteControl {

	
	//상수
	//최저 속력, 최곡 속력 상수를 선언하시오.
	//인터페이스 변서 선선 시, (public statuc final)이 자동으로 선언된다.
	int MAX_SPEED = 300;
	int MIN_SPEED = 0;
	
//	추상 메소드
// (public abstract)가 자동으로 선언된다.
	void turnOn();
	void turnOff();
	void setSpeed(int speed);

//디폴트 메소드
//	:구현한 객체가 오버라이딩하지 않아서 기본으로 사용할 수 있는 메소드
	default void parking(boolean check) {
		if(check) {
			System.out.println("주차 되었습니다.");
			setSpeed(MIN_SPEED);
		}
		else {
			System.out.println("주행모드를 시작합니다.");
			setSpeed(10);
			
		}
		

}
	
//	static매소드
//	구현 객체가 없어도 인터페이스 만으로도 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("베터리가 교체합니다.");
	}
	
}
//전혀 모르게써









