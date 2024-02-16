package project02;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double PI = 3.141592;
		
		System.out.println("원의 넓이");
		System.out.print("반지름: ");
		
		double r = sc.nextDouble();
		double area = r*r * PI;
		
		System.out.println("원의 넓이: " + area);
		

	}

}
