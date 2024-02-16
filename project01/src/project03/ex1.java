package project03;

import java.util.Scanner;

public class ex1 {
			//정수 두개가 입력으로 들어오면 큰수 - 작은수의 값을 출력하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오. : " );
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			System.out.println( A-B);
		} else if (A==B) {
			System.out.println(0);
		}
		else {
			System.out.println( B-A);
		}
		

	}

}
