package project05_2;

public class Car {

	//모델명, 속도
	
	String model;
	private int speed;
	public int setSpeed;
	public Car() {
		super();
	}
	
	//생성자
	//1) 기본 생성자 , alt + shift + S -> O 
	public  void Car1() {
		
	}

	//2) model 매개변수
	public Car(String model) {
		this.model = model;
	}
	
	public Car(String model, int speed) {
		super();
		this.model = model;
		this.speed = speed;
	}
	
	//3) 전체 매개변수 
	//getter: 값 가져옴 alt + shift + s -> r
	//setter : 값 지정함 
	// getname(), setname ("김씨")등등
	// 변수명의 첫 글자를 대문자로 하는 것이 관례 (문법오류x)
	public String getmodel() {
		return this.model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			speed = 0;
			System.out.println("불가능");
		} if (speed >= 300) {
			speed = 300;
			System.out.println("불가능하다");
		}
		this.speed = speed;
		
	}

	public void setModel(String model) {
		this.model = model;
	}
		
}
