package project03;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		//1~20까지의 정수 중, 홀수의 합계와 짝수의 합계를 각각 구하여 출력하시오.
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int sum1 = 0;
		int sum2 = 0;
		
		while (num <= 20) {
			if  ( num % 2 == 1) {
				sum1 += num;
			}
			
			if (num % 2 == 0) {
				sum2 += num;
			}
			num++;
		}
		System.out.println("홀수: " + sum1);
		System.out.println("짝수: " + sum2);
		
	}
		
}
