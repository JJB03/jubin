package project05_2;

public class Carex {
	
	public static void main(String[] args) {
		//객체 생성
		// 클래스명 객체명 = new 클래스명
		Car car = new Car();
		
		car.model = "제네시스";
		System.out.println("모델 명: " + car.getmodel());
System.out.println( );		
		car.setSpeed(500); //private 로 지정을 해 speed는 외부에서 접근 불가능하다.
		System.out.println("속력: " +  car.getSpeed());
	System.out.println( );
		car.setSpeed(-40); //private 로 지정을 해 speed는 외부에서 접근 불가능하다.
		System.out.println("속력: " +  car.getSpeed());
		
	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
