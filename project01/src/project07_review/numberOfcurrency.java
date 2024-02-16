package project07_review;

import java.util.Scanner;

/*
 * 아카데미에서 김조은 대리를 출장보낸다.
 * 이때 출장비를 다음과 같이 지급한다.
 * 출장비: 537620원
 * 50000원 10개
 * 10000원 3개
 * 5000원 1개
 * 1000원 2개
 * 500원 1개
 * 100원 1개
 * 50원 0개
 * 10원 2개
 */
//위와 같이 입력하면 큰 화폐단위부터 계산하여, 화폐단위 별로 화폐 매수를 출력하는 프로그램을 작성하시오.
public class numberOfcurrency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	int money = sc.nextInt();
	/*	int money50 = 50000;
		int money5 = 5000;
		int coin5 = 500;
		int money10 = 10000;
		int money1 = 1000;
		int coin1 = 100; */
		
		int input, count ,money = 50000;
		boolean sw = true;
		System.out.print("출장비: ");
		input = sc.nextInt();
	//	System.out.print("돈: " + money);
		
		while (money >= 1) {
		//화폐매수 계산, ( ) = 537620 / 10000
		count = input / money;
		System.out.println(money + "\t:" + count + "개" );
		//잔액 계산 537620 - 500000 = 37620, 37620 = 537620 - 50000
		input = input - (money*count); //덮어쓰기
		
		// 화폐단위 변환, ( ) = ( ) / 5 , ( ) = (  ) / 2 
		if(sw)
		money = money / 5;
		else
		money = money / 2;
		
		sw =! sw;
		}
		
		sc.close();
		//과정을 반복
	}
}
