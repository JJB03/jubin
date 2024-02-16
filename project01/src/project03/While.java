package project03;  
import java.util.Scanner;

public class While {
 /*
  * 조건을 만족하는 동안, 반복 실행
  * while (조건식) {
  * 반복 실행문; 종료조건이 성립하도록 작성해야 한다.
  * }
  */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		System.out.println(" while문 ~~~~");
		
		while (num<= 10) {
			System.out.println(num++ +" " );
		}
		
		//합계를 구하시오
		System.out.println("------------");
		int num1 = 1;
		int sum= 0;
		
		while(num1 <= 100) {
			System.out.println(  );
			sum = sum + num1;
			num1 = num1 + 1;
			
			// sum += num1++도 가능하다.
		}
		System.out.println("합계: " + sum);
		
		System.out.println(" ");
		System.out.println(" "); 
			
		
	
	}

}
