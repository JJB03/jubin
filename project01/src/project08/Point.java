package project08;
//선언, 매개변수 생성자, toString 정의
public class Point {
		int x;
		int y;
		//기본 생성자
		public Point() {
			
		}
		//매개변수 생성자
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		//toString 
		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
