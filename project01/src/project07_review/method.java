package project07_review;

import java.util.Scanner;

public class method {
	/*
	 * @param a
	 * @param b
	 * @return
	 */
	public static int plus(int a, int b) {
		int result = a+b;
	return result;	
	}
	
	//메소드 정의
	//접근지정자 (static)  반환타입 메소드명 매개변수
	public static int minus(int a, int b) {
		int result = a-b;
		// return (값) : 값을 메소드로 호출한 자리로 반환시키고 메소드 종류와 메모리 해제를 시킨다.
		return result;
		
	//	System.out.println("리턴 다음에 출력 불가능");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		
		//메소드 호출: 메소드명 (인자, 인자)
		System.out.println(plus (a,b)); // static으로 사용
		System.out.println(minus (a,b));
		
		
	}
}
