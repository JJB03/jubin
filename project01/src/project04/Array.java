package project04;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Array {
	private static final int[] Arr = null;
	/*
	배열선언
	int arr[];
	배열생성
	arr = new int [3];
	생성 및 선언
	int arr[] = new inr[];
	초기화
	int arr[] = { }  
	 */
		static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("__배열__");
	int arr[];
	arr = new int[5];
	
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
	arr[3] = 4;
	arr[4] = 5;
	
	// 배열의 길이" 베열 요소의ㅣ 개수 = 배열.length
	int N = arr.length;
	System.out.print("배열의 길이: "+ arr.length + ", ");
	
	for (int i = 0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");	
	}
	System.out.println(" ");
	
	System.out.println("__최솟값 구하기__");
	//첫째 줄에 입력할 갯 n개 입력받고, 둘째 줄에 n개의 정수를 공백을 두고 입력받으시오.
	// 그 갯수 중 최댓값을 출력하시오.
	int Arr[] = new int [N];
	int min = Integer.MAX_VALUE;
	
	for (int i = 0; i<N; i++) {
		arr[i] = sc.nextInt();
		if (min > Arr[i]) {
			min = arr[i];
		}
		
	}
	
	System.out.println("최솟값: " + min);
	sc.close();
	}
}
