package project03;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		//(단) x (1~9)
		// 단에 대한 반복 : 1 ~ 9 
		// 각 단의 곱 : 1~9
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <=9; i++) { 
			for (int j = 1; j <=9; j++) {
				System.out.println(i+"x" +j+"="+(i*j));
				System.out.println("\t");
			}
			System.out.println();
		}

	}

}
