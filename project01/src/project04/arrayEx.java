package project04;

import java.util.Scanner;

public class arrayEx {

	public static void main(String[] args) {
		int score [][] = { { }, { }, { } };
		int person[] = new int [4];
		int food[] = new int [5];
		
		String[] perName = {"김씨", "박씨", "이씨", "정씨", "구씨"};
		String[] fooName = {"김밥", "주먹밥", "비빔밥", "볶음밥", "맨 밥", "굶기"};
		
		for (int i = 0; i < perName.length; i++) {
			for (int j = 0; j < fooName.length; j++) {
				person[i] += score[i][j];
			}
			Scanner sc = new Scanner(System.in);
			System.out.println(perName[i]+" "+person[i]);
			
		}

	}

}
