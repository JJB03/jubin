package project02;

import java.util.Scanner;

public class operator {
/*
 * 대입연산자: 변수에 값을 대입하는 연산자
 * 부호연산자: 양수, 음수를 설정하는 연산자
 * 산술연산자: 사칙 연산을 사용하는 연산자 (우선 순위: %, /, * > +, - )
 * 증감연산자: 1만큼 줄이거나 늘린다.
 *          전위: ++a, --a 로 연산자 우선 순위가 높다. 후위: a--, a++ 연산자 우선 순위가 낮다.
 * 관계연산자: 값을 비교하는 연산자 (>, <, >=, >=, ==, !=) *!= : 두 값이 다르면 참, 다르면 반
 * 논리연산자: 값이 참이면 논리의 합도 참, 값이 부정이면 논리도 거짓임을 알려주는 연산자이다. 
 * 			(&&: 두 값이 모두 참, || 두 값 중 하나라도 참이면 참, != : 참의 경우 거짓, 거짓의 경우 참) 
 * 비트연산자: 논리가 참이면 1을 반환(&), 하나라도 참이면 1을 반환(|) *이미 앞 선 조건이 FALSE라면 후 조건은 검사하지 않는다.
 * 조건연산자: 주어진 조건이 참이냐 거짓이냐에 따라 값이 다르게 나온다.
 * 			조건식 ? 결과1 : 결과2;
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("대입, 산술 연산자 ____________");
		System.out.print("x: ");
		int x = sc.nextInt();

		System.out.print("y: ");
		int y = sc.nextInt();
		
		System.out.print("z: ");
		int z = sc.nextInt();
		
		int sum = x+ y+ z;
		double avg = (double) sum / 3; //sum, 3 모두 int타입이기에 소수부분을 표현할 수 없다. -> 강제 형변환 필요
		//혹은 3을 3.0으로 표현해준다.
		System.out.println("합계:" + sum);
		System.out.println("평균:" + avg);
		sc.close();
		
		System.out.println(" ");
		System.out.println("~~~~~~~~");
		System.out.println(10+2);
		System.out.println(20-30);
		System.out.println(4*9);
		System.out.println(2 % 5);
		
		
		System.out.println(" ");
		System.out.println("증감 연산자_________________");
		int a = 100;
				int b = ++a;
		System.out.println(b);
		
		int c = --a;
		System.out.println(c);
		
		System.out.println(" ~~~~~~~ ");
		int  w = 20;
		int e = 14;
		int q = ++w + e;
		System.out.println("q = " +q);
		System.out.println("w = " + w);
				
		System.out.println(" ");
		System.out.println("논리 연산자_________________");
		int num1 = 10;
		int num2 = 20;
		
		boolean number = ((num1 = num1 + 10) < 10) &&((num2 = num2 +2)<10); 
		System.out.println(number);
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println("~~~~~~~~");
		System.out.println(true||false); //하나라도 참이면 참
		System.out.println(true&&true); // 둘 다 참이면 참
		System.out.println(true!=false); //거짓된 대답
		System.out.println(!true); 
		
		System.out.println("--");
		
		int value1 = 3;
		System.out.println(false && ++ value1 > 10); //dead 코드로 증감이 되지 않음. -> 결과를 알면 죽음.
		System.out.println("value:" + value1);
		
		int value2= 3;
		System.out.println(true || ++ value2 > 10);
		System.out.println("value2: " + value2);
		
		System.out.println(" ");
		System.out.println("비트 연산자_________________");
		int result = 20 & 16;
		System.out.println("20%16= +" + result);
		System.out.println(Integer.toBinaryString(20)); //십진수를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-------------------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();

		int result2= 20|16;
		System.out.println("20|16=" + result2);
		System.out.println(Integer.toBinaryString(20)); //십진수를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-------------------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		
		int result3= 20^16; //XOR 연산, 서로 값이 다를 때 참이 됨.
		System.out.println("20^16=" + result2);
		System.out.println(Integer.toBinaryString(20)); //십진수를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-------------------------");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();

		int value3 = 3;
		System.out.println(false & ++ value1 > 10); //dead 코드가 아니라 증감이 됨.
		System.out.println("value:" + value1);
		
		int value4= 3;
		System.out.println(true | ++ value2 > 10);
		System.out.println("value2: " + value2);
		
		System.out.println(" ");
		System.out.println("조건 연산자_______________________");
		int A =3, B = 5;
		//a와 b, 두 수의 절댓값 차이를 구하시오.
		// A-B = -2, B-A =2
		
		int resulT = (A>B) ? A-B : B-A;
		System.out.println("두 수의 차:"+ result);
		
		//조건 연산자를 if로 바꾼다면
		if (A>B)
			resulT = A-B;
		else 
			resulT = B-A;
		System.out.println("result: " + resulT);
				
		
		
	}

}
