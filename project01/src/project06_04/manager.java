package project06_04;

import project06_04_1.person;

public class manager {
	public static void main(String[] args) {
	student student = new student();
	student.defaultSetting();
	System.out.println("name: " + student.name);
	System.out.println("age: "+ student.getAge()); //age가 private로 지정 -> get으로 받기
	//manager에서 student의 default 접근지정자 변수인 height를 접근할 수 없는 이유
	// : 같은 패키지에 있지만, 실질적으로 heught를 선언한 곳은 다른 패키지인 person임.
	// *선언한 class를 기준으로 접근지정자가 적용된다.
	System.out.println("height: " + student.getHeight());
	System.out.println("weight: " + student.getWeight());
	System.out.println( );
	
	
	person person = new person();
	System.out.println("name: " + person.name);
	System.out.println("age: " + person.getAge());
	System.out.println("height: " + person.getHeight());
	System.out.println("weight: " + person.getWeight());
	}
}
