package project04;

public class ENUM {
	/*
	 * 열거타입 enum: 한정된 상수 집합 값
	 * enum 파일로도 정의 가능, 클래스 파일내서 정의 가능
	 * 1) 비교할 땐 타입도 비교한다
	 * 2) 상수값이 재정의 돼도 다시 컴파일 할 필요가 없다.
	 * 3)
	 */
	
	enum test {a, b, c, d, e, f};
	
	public static void main(String[] args) {
		//rainbow 가져오기
		Rainbow[] rainbow = Rainbow.values(); //values : 열거 타입의 모든 요소를 배열로 반환
		
		for (Rainbow color : rainbow) {
			System.out.print(color +  " "); 
			
		}
		System.out.println( );
		//valueOf() : 전달된 문자열과 일치하는 열거타입 상수를 반환
		Rainbow g = Rainbow.valueOf("Purple");
		System.out.println("G: "+g);
		
		//ordinal: 해당 열거체 상수가 정의된 순서를 반환한다.
		int index = g.ordinal();
		System.out.println("purple의 index: "+index);

	}

}
