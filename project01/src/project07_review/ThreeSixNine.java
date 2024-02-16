package project07_review;

import java.util.Scanner;

public class ThreeSixNine {
 //정수 1부터 100까지 수를 반복하면서 해당 수가 3, 6, 9가 될 때 개수 만큼 *를 출력하는 프로그램
	public static void main(String[] args) {
		
//		boolean ten369 = (ten != 0) && (ten % 3 == 0);
	/*	for (int i = 10; i <= 100; i++) {
			for (int j = 1; j <=10; j++) {
				if(j % 3 == 0) {
					System.out.println("*");
				}
			}
				System.out.println("**");
		} */
		
		for (int i = 0; i <=100; i++) {
			int ten = i / 10; //십의 자리수 (정수만)
			int one = 1 % 10; //일의 자리수
			
			boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			boolean one369 = one == 3 || one == 6 || one == 9;
		
			if(ten369 && one369)
				System.out.println("**");
			else if(ten369||one369)
				System.out.println("*");
			else
				System.out.println(i);
	 }
		
   }
}
