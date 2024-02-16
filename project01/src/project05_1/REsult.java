package project05_1;

import java.util.Iterator;
import java.util.Scanner;

public class REsult {
 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Calculator result = new Calculator();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		result.plus(a, b);
		int plus = (a+b);
		System.out.println(a + "+" + b + "=" + plus  );
		
		result.minus(a, b);
		int minus = (a-b);
		System.out.println(a + "-" + b + "=" + minus  );
		
		result.multiple(a, b);
		int multiple = (a*b);
		System.out.println(a + "x" + b + "=" + multiple  );
	
		result.divide(a, b);
		int divide = (a/b);
		System.out.println(a + "/" + b + "=" + divide  );
		
		result.remain(a, b); // a % b
		int remain = (a%b);
		System.out.println( a + " 와 " + b + " 의 나머지는" + remain );
		
	}
	public int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;	
	}
	public double avg(int[] arr) {
		int sum = sum(arr);
		double avg = 0.0;		
		
		for (int i : arr) {
			sum += i;
		}
		
		avg = (double) sum / arr.length;
		return avg;
	}
	
	
}
