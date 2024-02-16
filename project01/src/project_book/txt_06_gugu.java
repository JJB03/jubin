package project_book;

import java.util.Scanner;

public class txt_06_gugu {
// 구구단을 짝수단만 출력하도록 프로그램을 만들어보세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
		for (int i = 0; i <=9; i++) {
			if(num % 2 == 0) {
			int sum = i * num;	
			System.out.println(sum);
			}
		}

	}

}
