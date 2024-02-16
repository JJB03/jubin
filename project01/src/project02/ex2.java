package project02;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		//정수 3개를 입력받아 합과 평균을 출력해보자.
		//단, -2147483648 ~ +2147483647
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int total = num1 + num2 + num3;
		double avg = total/3.0;  
		String avg2 = String.format("%.1f", avg); //소수점 고정시키기
		System.out.println("총합: "  + total);
		System.out.println("평균: " + avg2);

	}

}
