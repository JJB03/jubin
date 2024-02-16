package project_Ex;

import java.util.Scanner;

public class arr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int [6];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		for (int i = 1; i < A.length; i++) {
			for (int j = i; j < A.length; j++) {
				int w = j-1; //비교
				int key = A[j];
				
				if(A[w] > key) {
					A[w+1] = A[w];
					A[j-1] = key;
				
				}else {
					A[j] = key;
				}
			}
		}
		for (int i : A) {
			System.out.print(i + " ");
		}
		
		

	}

}
