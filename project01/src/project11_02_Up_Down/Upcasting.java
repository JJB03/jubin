package project11_02_Up_Down;

public class Upcasting {
	
public static void main(String[] args) { //업캐스팅: 자동 타입 변환자, (부모) = (자식)
	Person p = new Student("김조은", 20, 1, " 정보통신공학");
	
	//person : name, age
	//Student : name, age, grade, major
	System.out.println("name: " + p.name);
	System.out.println("age: " + p.age);
	
	//person 객체에는 없는 grade, major 추가
	// ㄴ 클래슬르 업캐스팅하면 변수는 부모 클래스만 접근가능하고 메소드는 자식 클래스의 메소드가 우선 실행된다.
	//System.out.println("grade: " + p.grade );
	//System.out.println("major: " + p.major);
	System.out.println(p);
	System.out.println(p.work());
	/*
	 * 바인딩
	 * 프로그램에서 사용되는 요소에 실제 값을 결정 짓는 행위
	 * -
	 * 정적 바인딩
	 * 컴파일 시간에 결정 (변수 등)
	 * -
	 * 동적 바인딩
	 * 실행시간에 결정 (오버라이딩 등)
	 */
	}
}
