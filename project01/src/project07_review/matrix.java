package project07_review;

import java.util.Scanner;

//양의 정수 M과 N을 입력받아 저장하고,
		// M행 N열의 2차원 배열을 생성한다.
		// 각 요소의 값을 입력받고, 그대로 출력하시오.
		// (입력 예시)
		// M : 2
		// N : 3
		// 1 2 3
		// 4 5 6
		// (출력 예시)
		// 1 2 3
		// 4 5 6
public class matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("M: ");
		int m = sc.nextInt();
		System.out.print("N: ");
		int n = sc.nextInt();
		//2차원 배열
		int arr[][] = new int [m][n];
		//바깥 반복문: 반복 변수가 i(행), 안쪽 반복문: 반복 변수가 j(열)
		for (int i = 0; i < arr.length; i++) { //행의 크기
			for (int j = 0; j < arr.length; j++) { //열의 크기
				arr[i][j] = sc.nextInt();
			}
		
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("-----------------");
			
			//foreach문 2차원 출력
			for (int[] row : arr) {
				for (int col : row) {
					System.out.println(col + " ");
				}
				System.out.println();
			}
			
			sc.close();
		}
		
	}
}
