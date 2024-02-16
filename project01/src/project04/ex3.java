package project04;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		//n이 입력되면 n인 다음과 같은 2차원 배열을 출력하시오.
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int arr[][] = new int [N][N];
		int k= 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr [j][i] = k++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr [i][j] + " ");
			}
		}

	}

}
