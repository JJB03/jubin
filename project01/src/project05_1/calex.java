package project05_1;
import java.util.Scanner;

public class calex {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		//덧셈 호출
		int result1 = cal.plus(a, b);
		System.out.println("a+b = " + result1);
		
		//뺄쎔 호출
		int result2 = cal.minus(a, b);
		System.out.println("a-b = "+result2);
		
		double z = sc.nextDouble();
		double y = sc.nextDouble();
		double result3 = cal.multiple(z, y);
		System.out.printf("Z x Y = %5.2f \n ", result3);
		
		double result4 = cal.divide(z, y);
		System.out.printf("Z/Y = %5.2f %d \n " ,result4, 100);
		
		// printf ("포멧", 변수) : %x.y (리터럴)
		// -X : 양수 - 크기만큼 칸을 지정하고 으른쪽으로 정렬한다
		// 		음수 - 크기만큼 칸을 지정하고 왼쪽으로 정렬한다.
		// -Y : 지정한 크기만큼 소수점 아래자리 수를 반올림으로 표현한다
		// %d(정수) %f(실수) %s(문자열)
		int arr[] = {10,20,30,40,50};
		System.out.println("합계: " +  cal.sum(arr));
		System.out.println("평균: "+ cal.avg(arr));
		
		sc.close();
		
	}
}
