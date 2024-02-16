package project02;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(" " );
		int a = sc.nextInt();
		System.out.print(" " );
		int b = sc.nextInt();

		int c = a+b;
		int d = a-b;
		int f = a*b;
		double e = (double) a/b;

		System.out.println(a+"+"+b+"="+c);
		System.out.println(a+"-"+"="+d);
		System.out.println(a+"x"+b+"="+f);
		System.out.print(a+"/"+b+"="+e);
		
		sc.close();
	}

}
