package project04;

import java.util.Scanner;

public class StRing {

	public static void main(String[] args) {
		// char -> 'a' , String -> "Hello"
		Scanner sc = new Scanner(System.in);
		
		//문자 리터럴로 지정
		// 비교시에는 equals() 사용
		String A = "Hello";
		String B  = "Java";
		String C = "Hello";
		String D = "World";
		
		// 문자열 객체 생성
		String E = new String("Hello");
		String F = new String("JAVA");
		String G = new String("Hello");
		

		System.out.println(" a==c : " + (A==C));
		System.out.println(" a==d : " + (A ==D));
		System.out.println("문자열 비교: " + A.equals(E));
		
		System.out.println("E=G: "+(E==G));
		System.out.println("문자열 비교: " + E.equals(F));
	}

}
