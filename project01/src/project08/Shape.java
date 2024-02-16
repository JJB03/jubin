package project08;
//추상클래스로 정의하시오 abstract
// 멤버변수 point 객체 선언
//	넓이와 둘레 공식 정의, 둘레 구하는 메소드 원형 정의, get/set 정의
public abstract class Shape { 
	//멤버 변수를 선언하시오.
Point p;
	
//추상 메소드
abstract double area();
abstract double round();

//getter, setter
public Point getP() {
	return p;
	}
public void setP(Point p) {
	this.p = p;
	}


}
