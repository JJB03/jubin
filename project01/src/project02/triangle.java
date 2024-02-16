package project02;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 삼각형의 넓이 ");
		System.out.println("밑변: ");
		
		double width= sc.nextDouble();
		
		System.out.println("높이: ");
		double height = sc.nextDouble();
		
		double area = width * height / 2;
		System.out.println("넓이: " + area);
		
		sc.close();

	}

}
