package project06_04;

import project06_04_1.person;

public class student extends person{

	//생성자
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public student(String name, int age, int height, int weight) {
		super(name, age, height, weight);
	}
	
	public void defaultSetting() {
		name = " 이름없음 ";
		age = 20;		//protected 로 person 을 상속 받았기에 가능하다.
		setHeight(150);	// height = 150; default 접근이기에 (다른 패키지) 가져가는 게 불가능
		setWeight(40);	// weight = 40; private 접근이기에 불가능하다.
	}
	
}
