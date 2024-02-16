package project07_review;

import java.util.Scanner;

public class Multiple {
	
	public static void main(String[] args) {
		//main -> 프로그램 실행 시, 가장 먼저 실행되는 메소드
		//정수를 입력 받아서 3의 배수인지 아닌지 판단하고 출력하는 프로그램을 작성하시오.
		// 3의 배수면 " 3의 배수입니다. " 아니면 " 3의 배수가 아닙니다. "
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n % 3 == 0) {
			System.out.println(" 3의 배수입니다.");
		} else System.out.println(" 3의 배수가 아닙니다.");
			
		
		sc.close();
	}

}
