package project03;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		/*
		 * 구구단 
		 */
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
			for (int i=1; i<=9; i++) {
				int sum = i*num1;
			System.out.println(num1+"*"+i+"="+sum);
		}
	}

}
