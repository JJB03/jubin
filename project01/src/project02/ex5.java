package project02;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// 두 정수 중 큰 정수를 출력한다.
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c;
		c = (a > b) ? a : b ;
		System.out.println("더 큰 숫자는 " + c);

	}

}
