package project11_01_try_Catch;

import java.util.Scanner;

/*예외처리
 * -ArithmeticException : 산술 연산 예외 - 어던 수를 0으로 나누는 경우 수학적 정의 불가
 *   ㄴA/0
 */
public class DivideByzero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a; int b;
		
		System.out.print("a: ");
		a = sc.nextInt();
		System.out.print("b: ");
		 b = sc.nextInt();

		 try {			
			 //예외 발생  가능성있는 문장, 예외처리: try - catch 문으로 ( ctrl + space )
			 System.out.println("a/b: " + a/b);
		} catch (ArithmeticException e) { //예외 타입 객체를 작성, *Exception: 최상위 예외 클래스
			System.err.println(" 0으로 나누는 연산은 존재하지 않습니다.");
		} finally { // 없어도 되는 블록, 예외와 무관하게 실행되는 문장입니다.
			System.out.println("실행되는 지 확인");
			sc.close(); 
		}
		 	System.out.println(" 종료합니다. ");		 
	}
}
