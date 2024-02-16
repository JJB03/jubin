package project03;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// 인학이는 숫자 7을 좋아한다. 어떤 정수가 입력되면 그 수가 7의 배수인지 확인하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오: " );
		int num = sc.nextInt();
		
		if(num%7 == 0) {
			System.out.println("7의 배수가 맞습니다.");
		} else System.out.println(" 7의 배수가 아닙니다.");
	}

}
