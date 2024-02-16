package project08_1;
//1
public interface RemoteControl {
	//최저속력, 최고속력 상수
	//인터페이스는 변수 선언시, (public static final)이 자동으로 선언된다.
	int Max_Speed = 300;
	int Min_Speed = 0;
	
	//추상 메소드, abstract가 생략되어 있다.
	void turnOn();
	void turnOff();
	void setSpeed(int speed);
	
	// 디폴트 메소드: 구현한 객체가 기본으로 사용할 수 있는 메소드
	default void parking(boolean check) {
		if(check) {
			System.out.println("주차되었습니다.");
			setSpeed(Min_Speed);
		} else
			System.out.println("주행을 시작합니다.");
		setSpeed(10);
	}
	
	//static: 객체 생성하지 않아도 사용 가능.
	static void changeBattery() {
		System.out.println("배터리를 교환하였습니다.");
	}
	
}
