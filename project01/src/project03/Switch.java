package project03;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		/*
		 * 조건문2
		 * 조건 값이 case 키워드값과 일치할 때, 실행한다.
		 * 조건 값: char, short, int, 열거체 가능 *실수는 불가능
		 * 
		 * 문법
		 * switch ( 조건 값) {
		 * case 값1:
		 * 		실행문 ;
		 * 		break;
		 * case 값2:
		 * 		실행문 ;
		 * 		break;
		 * case 값3:
		 * 		실행문 ;
		 * 		break;
		 * default
		 * 		실행문;
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("학점을 입력하시오: ");
		String grade = sc.next(); //scanner에는 char이 없기에 문자열 String을 사용한다. 
		
		switch(grade) {
		case "A":
			System.out.println("90~100점입니다.");
		break;
		case "B":
			System.out.println("80~89점입니다.");
			break;
		case "C":
			System.out.println("70~79점입니다.");
			break;
		case "D":
			System.out.println("60~69점입니다.");
			break;
		case "E":
			System.out.println("59점이하입니다.");
			break;
		default:
			System.out.println("잘못 입력됐습니다.");
			break;
		}
		
		// 입력받은 정수를 5로 나누고 나머지가 2보다 작으면 * 출력
		System.out.println(" ");
		System.out.println("switch break~~~~~~~");
		System.out.println("숫자 입력: ");
		int num = sc.nextInt();
		
		switch(num/5 >> 2) {
		case 1:
			System.out.println("*");
			break;
		case 0:
			System.out.println("*");
			break;
		default:
			System.out.println("**");
			break;
		}
		
		
	}

}
