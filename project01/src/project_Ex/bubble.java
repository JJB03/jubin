package project_Ex;

import java.util.Scanner;

public class bubble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int [6];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		for (int i = 0; i < A.length-1; i++) {
			for (int j = 0; j < 5-i; j++) {
				if(A[j] > A[j+1]) {
					int temp = A[j];
					A[j] = A [j+1];
					A[j+1] = temp;
				}
			}
		}
		for (int i : A) {
			System.out.print(i + " ");
		}

	}

}
