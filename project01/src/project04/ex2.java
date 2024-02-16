package project04;

import java.util.Iterator;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int [n][n];
		int cnt = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt++;
				System.out.print(arr[i][j]+ " ");
			}
		}
		
	}

}
