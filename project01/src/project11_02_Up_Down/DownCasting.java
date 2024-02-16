package project11_02_Up_Down;

public class DownCasting {
// 강제 형변환
	// 전체 조건: 업 캐스팅
	// 다운 캐스팅은 업캐스팅된 부모 객체를 자식 객체로 변환시키는 것
	public static void main(String[] args) {
		
		//up
			Person p = new Student("김조은", 20 , 10 , "컴퓨터공학과");
		//	Person p = new Person("김조은", 20); //오류 발생
		System.out.println(p);
		System.out.println(p.work());
		
		
		
		//down
		Student st = (Student) p;
		
		System.out.println(st);
		System.out.println(st.work());
		
		System.out.println("grade: " + st.grade);
		System.out.println("major: " + st.major);
	}
	
}
