package project06_ex;

import java.util.Iterator;
import java.util.Scanner;

public class rottoex {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int rotto[] = new int[6];
	int my_lotto[] = new int[6];
	
	for (int i = 0; i < rotto.length; i++) {
		rotto[i] = sc.nextInt();
	}	
	
	int bonus = sc.nextInt();
	
	for (int i = 0; i < my_lotto.length; i++) {
		my_lotto[i] = sc.nextInt();
	}
	
	int count = 0;
	for (int i = 0; i < rotto.length; i++) {
		for (int j = 0; j < my_lotto.length; j++) {
			if(rotto[i] == my_lotto[j]) {
				count++;
			}
		}
	}
	int check = 0;
	for (int i = 0; i < my_lotto.length; i++) {
		if(bonus == my_lotto[i])
			check = 1; 
	}
	
	System.out.println(count);
	switch (count) {
	case 1: 
		System.out.println("꽝");
		break;
	case 2: 
		System.out.println("꽝");
		break;
	case 3: 
		System.out.println("5등");
		break;
	case 4: 
		System.out.println("4등");
		break;
	case 5: 
		if(check == 1 ) {
			System.out.println("2등");
		} else {
			System.out.println("3등");
		}
			
		break;
	case 6: 
		System.out.println("1등");
		break;
	}
	/*
		System.out.println(" ------rotto 순위표------------");
		System.out.println("1등: " );
		System.out.println("2등: ");
		System.out.println("3등: ");
		System.out.println("4등: ");
		System.out.println("5등: ");
		System.out.println(" ------내 로또------------");
		System.out.print("로또 번호:" );
		int a = sc.nextInt();
		System.out.println("나의 랭킹:" );
*/
	}

}
