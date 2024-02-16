package project06;

/*
 * 반지름 1~5인 Circle 객체를 5개 가지는 객체 배열을 생성하고,
 * 배열 요소에 있는 모든 Circle 객체의 넓이를 출력하세요.
 */
class Circle {
	//변수: 반지름, ㅠr
	int r;
	
	// 생성자
	public Circle(int r) {
		this.r = r;
	}
	
	//메소드
	public double area() {
		// 원주율 :3.141592....
		return Math.PI *  Math.pow(r, 2); //this.r * this.r;
	}
}
public class CircleArray {
	public static void main(String[] args) {
		Circle[] c; //Circle 배열에 대한 레퍼런스 선언
		c = new Circle[5];
		
		for (int i = 0; i < c.length; i++) {
			//반지름 1~5까지 객체 생성
			c[i] = new Circle(i+1); // 12345
		}
		
		for (Circle circle : c) {
			System.out.println("널이: " + circle.area());
		}

	}

}
