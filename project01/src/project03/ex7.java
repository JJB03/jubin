package project03;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) { //행
			for (int j = 1; j <= i; j++) { //열
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
