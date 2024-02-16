package project08;
//디자인 패턴: 프로그램을 코드를 효율적으로 작성하기 위한 모범 답안이다.
	// ㄴ 싱글톤 패턴: 디자인 패턴 중 하나로 프로그램이 시작될 때, 최초로 한 번만 메모리를 할당해서 인스턴스를 사용하는 패턴
	// 객체가 필요할 때 새로운 객체를 생성하지 않고 기존 인스턴스를 활용하는 코드 패턴
	// 객체를 하나만 생성하기 때문에 메모리를 효율적으로 사용할 수 있다.
public class singleTon {
	//static 키워드로 유일한 객체를 생성하기
	private static singleTon instance = new singleTon();
	
	//생성자를 private로 정의해서 외부에서 인스턴스 생성을 막는다.
	private singleTon() {
		
	}
	
	//유일한 객체를 가져오는 메소드
	public static singleTon getInstance() {
		//인스턴스 확인
		if(instance == null) {
			instance = new singleTon();
		}
		return instance;
		
	}

}
