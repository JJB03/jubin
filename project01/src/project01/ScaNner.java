package project01;
import java.util.Scanner;

public class ScaNner {

	public static void main(String[] args) {
		// 객체 생성 키워드 : new
		// 클래스타입 객체명 = new 클래스명(_)
		// Scanner : 표준 입력 객체 -> 외부 정의 끌어오기.
		Scanner sc = new Scanner (System.in); //예약어 뒤에 space 를 누르면 자동 import가 가능함.
		
		System.out.println("B 숫자 정하기. ");
		int A = sc.nextInt(); // 정수받는 메소드
		System.out.println("B: " + A); // A + A 는 합산, "A :  " + A 는 문자열 + 숫자의 연결 
		
		sc.close(); // close(): scanner 객체를 메모리에서 해체됨.
		// 이 뒤에 sc.nextInt(); 를 넣어도 작업 진행X
		
	}

}
