package project03;

import java.util.Scanner;

public class ContinueBreak {
	/*
	 * for(자료형 : 배열 or 컬렉션){
	 * 	반복 실행문;
	 * } -> 나중에 배움
	 * 
	 * continue
	 * break
	 */
	public static void main(String[] args) {
		//5개의 정수를 입력받은 수의 양수의 합계만 출력하시오.
		Scanner sc = new Scanner(System.in);
	/*	int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			
			//음수 제외
			if(n<0)
				continue; //다음 단계로 점프
			sum += n;
		}
		System.out.println("양수의 합: " + sum);
		*/
		
		while (true) { //무한 반복문 : 종료조건이 없어서 추가해줘야 한다.
			System.out.print("입력: ");
			String str = sc.nextLine();  //문자열을 한 줄 입력받게 하는 메소드
			
			if (str.equals("Stop")) {  //비교문자열
				break;
			}
			System.out.println(">>" + str);
		}
		System.out.println(" 프로그램을 종료합니다. ");
		
		sc.close();
		
		
	}
}
