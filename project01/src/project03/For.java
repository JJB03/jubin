package project03;

import java.util.Iterator;
import java.util.Scanner;
/*
 * for (초기식; 조건식; 증감식) {
 * 반복 실행문;
 * }
 */

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<=10; i++) { //1~10까지 정수를 출력하시오.
			System.out.println(i + " ");
		}
		System.out.println( );
	
	for(int u=50; u <= 100; u++) { //50~100까지 정수를 출력하시오.
		System.out.println(u + " ");
	}
	System.out.println( );
	
	for(int z=1; z <= 20; z++) { //1~20까지 짝수를 출력하시오.
		if (z%2 == 0)
		System.out.println(z + " ");
	}
	System.out.println( );
	
	for(int z=1; z <= 20; z++) { //1~20까지 홀수를 출력하시오.
		if (z%2 == 1)
			System.out.println(z + " ");
	}
	System.out.println( );
	
		

	}

}
