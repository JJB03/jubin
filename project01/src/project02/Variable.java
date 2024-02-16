package project02;

import java.util.Scanner;
import javax.print.attribute.SetOfIntegerSyntax;

public class Variable {
	public static void main(String[] args) {
		/*
		 * 변수 *이름을 공백, 숫자나 예약어로 사용할 수 없음, *언더바_와 달러$는 사용 가능
		 * byte, short, int, long : 정수를 나타내는 자료형
		 * char: 문자를 나타내는 자료형
		 *리터럴(Literal): 소스코드에 표기하는 데이터 (숫자, 문자, 문자열)
		 *float, double: 실수를 나타내는 자료형
		 * boolean" 논리 자료형 (true/false)
		 * 상수: 프로그램 실행동안 값이 변하지 않는다. 선언 시 값을 초기화하며 그후 바꿀 수가 없다. *final
		 */
		
		System.out.print("정수형 byte");
		System.out.println("________________");		
		byte var1 = - 128;
		byte var2 = - 30;
		byte var3 = 0;
		byte var4 = 30;
//		byte var5 = 128; //에러 발생 , 127까지 존재, overflow
		byte var5= (byte) 128; //강제 형변환, 지금 마이너스 단계
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
		System.out.println(" ");
		
		System.out.print("정수형 int&정수 리터럴");
		System.out.println("_____________________");
		int x,y, z; // 변수 동시 선언
		x = 100; // 대입연산자
		y = 200;
		z = x+y;
		int level = 12; //선언과 초기화 동시에 하기.
		
		System.out.println(level);
		System.out.println("* x+y= "+x+y); //문자열 데이터 오류, "x+y= "(문자열) + x+y(정수형 -> 문자열)
		System.out.println("x+y= "+(x+y)); //우선순위 정하기 *, /  > +, -
		System.out.println("z/2= "+(z/2));
		
		/* 정수 리터럴
		 * 10진수 : 0 1 2 3 4 5 6 7 8 9 
		 * 8진수: 0 1 2 3 4 5 6 7
		 * 16진수: 0 1 2 3 4 5 6 7 8 9 A B C D E F
		 * A(10) B(11) C(12)) D(13) E(14) F(15)
		 */
		int Var1 = 10; //10
		System.out.println("Var1: " + Var1 +"진수");
		
		int Var2 = 010; //8
		System.out.println("Var2: " + Var2 +"진수");
		
		int Var3 = 0x10;//16
		System.out.println("Var3: " + Var3 +"진수");
		
		System.out.println(" ");
		
		System.out.print("정수형 long");
		System.out.println("_____________________");
		long lang1 = 1000; //int 취급
		long lang2 = 21000000;
		long lang3 = 22000000000000L; //long 취급
		
		System.out.println("lang1: " + lang1);
		System.out.println("lang2: " + lang2);
		System.out.println("lang3: " + lang3);
		
		//정수 long 타입의 리터널은 L *L을 붙이지 않으면 기본정수는 int타입으로 취급한다.
		System.out.println(" ");
		
		System.out.print("문자 리터럴");
		System.out.println("___________________________");
		char a= 'A'; //문자 리터럴 : 'A' 
		char a1 = (char) (a + 1); // 강제 형변환: 작은 자료형을 유지한다, 자동 형변환: char < int -> 더 큰 자료형으로 바꾸기
		char b = 65; // 10진수 (아스키코드)
		char c = '\u0041'; //유니코드
		char d = '가';
		char e = 44032;
		char f = '\uac00';
		
		System.out.print(a);
		System.out.print("," + b);
		System.out.println(","+c);
		System.out.println(a1);
		System.out.print(d);
		System.out.print("," + e);
		System.out.println("," + f);
		System.out.println(" ");
		
		System.out.print("실수 자료형");
		System.out.println("_____________________________");
		
		double vAr1= 3.14; //기본적으로 double로 인식
		double vAr2= 3.14D;
		
		float vAr3= 3.14F;
		
		double vAr4 = 0.123456789;
		float vAr5 = 0.123456789F;
		
		System.out.println("vAr1: "+ vAr1);
		System.out.println("vAr2: "+ vAr2);
		System.out.println("vAr3: "+ vAr3);
		System.out.println("vAr4: "+ vAr4); //17
		System.out.println("vAr5: "+ vAr5); //8
		//float 타입 리터럴: F, double 타입 리터럴: D (D는 생략이 가능하다)
		System.out.println(" ");
		
		System.out.print("논리 자료형");
		System.out.println("_______________________________");
		
		boolean vaR1 = false;
		boolean vaR2 = true;
		
		Scanner sc = new Scanner(System.in);
		boolean on = sc.nextBoolean(); //논리값을 받는 메소드
		
		System.out.println("on: "+on);
		
		if(on) {
			System.out.println("전원 on");
		}
		else {
			System.out.println("전원 off");
		}
		sc.close();
	}

}
