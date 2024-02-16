package project_Ex;

import java.util.Scanner;

//중복 없애기, 선택정렬로 오름차순하기.
public class selectSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int [6]; //배열
		
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
	
		
		for (int i = 0; i < A.length; i++) { //반복
			for (int j = 0; j < A.length; j++) {
				int  temp = A[i]; //저장
				
				if(A[i] >= A[j]) { //비교
					
				}else {
					A[i] = A[j];
					A[j] = temp;
				}
			}
			}
		for (int i : A) { //출력
			System.out.print(i + " ");
			}
		}
}
