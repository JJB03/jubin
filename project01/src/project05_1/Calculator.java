package project05_1;

public class Calculator {
/*
 * 계산기
 * 피연산자를 2개로 하는 계산기
 * 1)사칙연산
 * 2) 나머지 실수 % 실수 
 * 3) 합계
 * 4) 평균
 */
	// 메소드명 : plus minus multiple divide remain sum avg

	
	public int plus(int a, int b) {
		int result = a+b;
		return result;
	}
	
	public int minus(int a, int b) {
		int result = a-b;
		return result;
	}
	
	public double multiple(double z, double y) {
		double result = z*y;
		return result;
	}
	
	public double divide(double z, double y) {
		double result = z/y;
		return result;
	}
	
	public int remain(int a, int b) {
		int result = a%b;
		return result;
	}
	
	public int sum(int arr[]) {
		
		int result = 0;
		return result;
	}
	
	public double avg(int[] arr) {
		double result = 0;
		return result;
	}
}
