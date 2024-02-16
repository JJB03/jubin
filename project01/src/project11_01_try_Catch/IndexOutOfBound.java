package project11_01_try_Catch;

import java.util.Scanner;

/*	예외처리
 * IndexOutOfBound
 * 배열이나 문자열의 index 를 벗어난 예외이다.
 */
public class IndexOutOfBound {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 요소의 개수: ");
		int N = sc.nextInt();
		int [] arr = new int[N];
		
		System.out.print("접근할 index: ");
		int index = sc.nextInt();
		System.out.print("입력할 값: ");
		int input = sc.nextInt();
		
		try { //배열 index를 초과하여 접근한 경우의 상황
			arr[index] = input;
			System.out.println("arr[" + index + "] "+arr[index]);			
		} catch (Exception e) {
			System.err.println("배열의 index 범위를 초과하였습니다.");
			System.err.println("0~"+(N-1)+" 사이의 정수 범위에서 입력하세요.");
		} finally {
			System.out.println("실행되었습니다");
		}
		
	}

}
