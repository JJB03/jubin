package project_book;

import java.util.Scanner;

//구구단을 단보다 곱하는 수가 작거나 같은 경우에만 출력한다.
public class txt_07_gugu2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		for (int i = 0; i <=9; i++) {
			if(num >= num2) {
				int sum = num*num2;
				System.out.println(num+ "x" +num2 +"="+ sum);
				break;
			}
		}
	}
	
}
