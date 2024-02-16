package project11_01_try_Catch;
import java.util.Scanner;

/*예외처리
 * - NumberFormatException : 문자열 숫자가 아닌 문자열을 숫자타입으로 변환할 시 발생
 */
public class NumberFormat {
public static void main(String[] args) {
	String strNum = "10";
	int num = 10;
	
	System.out.println("10 + 20 = " + (strNum + 20));
	System.out.println("10 + 20 = " + (num + 20));
	
	String numberString = "10";
	Scanner sc = new Scanner(System.in);
	int num1 = Integer.parseInt(numberString); // 변환 가능 메소드	
	
	String numberAndString = "A10";
	System.out.println("numberString + 5 " + (numberString + 5 ));
	int num2 = 0;
	
	//예외메시지 : 문자열 숫자가 아닌 문자열을 숫자로 변환할 수 없다.
	try {
		num2 = Integer.parseInt(numberAndString);		
	} catch (NumberFormatException e) {
		System.err.println("문자열 숫자가 아닌 문자열은 숫자타입으로 변환할 수 없다.");
	}
	System.out.println(" num 1  + 10 = " + (num1+10)); //int 정수로 변환되서 산술 연산 가능
	System.out.println("num2: " + num2);
	
}
}
