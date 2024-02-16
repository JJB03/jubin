package project04;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[][] = new int[n][n];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i][0] = sc.nextInt();
		
	}
	for (int i = 1; i < arr.length; i++) {
		for (int j = 1; j <= i; j++) {
			arr[i][j] = arr[i][j-1] - arr [i-1][j-1]; //수식계산
			}
		}
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print(arr[i][j]+ " ");
		}
		System.out.println();
	}
		
	}

}

/*
 * 순서도
 * 1, 정수 n을 입력 받는다
 * 2, n열 n행의 2차원 배열
 * 3, n번 반복하여 n개의 정소를 배열의 j+1 번째부터 순서대로 값을 계산한다.
 * 4, 배열을 아래의 반복변수 i j 로 반복한다.
 *  i: 1~3 (N-1)
 *  j: 1~i
 *  arr[i][j] = arr[i][j-1] - arr [i-1][j-1]
 *  수식으로 연산하여 빈칸에 대입한다
 *  5, 배열을 반복하여 값이 있는 부분만 출력한다.
 */
