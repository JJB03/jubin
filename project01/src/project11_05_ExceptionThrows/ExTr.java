package project11_05_ExceptionThrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTr {
 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	try {
		//예외 호출로 전가받는다.
		input();		
	} catch (Exception e) {
		// TODO: handle exception
		System.err.println("정수만 입력해주세요");
		}
	}
	
	//전가 키워드 : throws
	public static void input() throws InputMismatchException {
		System.out.print(" 입력 : ");
		int input = sc.nextInt(); //예외 발생 가능성 코드
		System.out.println(input);
	}
}
