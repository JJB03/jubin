package project03;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * if(조건식){ 참일 때 실행
		 * 		수행문;
		 * } else { 부정일 때 실행
		 * 		수행문2; 
		 * }
		 * 
		 * *if단독일 시 if() 수행문 가능 -> 괄호 삭제
		 * 
		 * if( ){ *다중일 경우
		 * 
		 * } 
		 * else if () {
		 * 
		 * } 
		 * else if () {
		 * 
		 * } else 
		 */
		
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int score = sc.nextInt();
		//입력받은 값이 홀수인지, 짝수인지 판단하시오
		
		System.out.println("숫자를 적으시오: " + num);
		System.out.println("if else문 ~~~~");
		if(num % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}

		
		System.out.println(" ");
		System.out.println(" if if문 ~~~~~~~~");
		if(num % 2 == 1) {
			System.out.println("홀수입니다.");
		} 
		if( num % 2 == 0){
			System.out.println("짝수입니다.");
		}
		
		System.out.println(" ");
		System.out.println("else if문 ~~~~~~~~~~~");
		// 학생의 성적을 입력받고, 성적에 따라 학점을 출력하시오
		// 90 a 80 b, 70 c, 60 d, 60미만 f 
		
		System.out.println("점수를 입력하시오: " + score);
		if (score >= 90) { 
			System.out.println("A학점입니다.");
		} else if (score >= 80) {
			System.out.println("B학점입니다.");
		} else if (score >= 60) {
		System.out.println("C학점입니다.");
	} else if (score > 50) {
		System.out.println("D학점입니다.");
	} else {
	System.out.println("F 학점입니다.");
	} 
		
		System.out.println(" ");
		System.out.println("중첩 반복문 ~~~~~~~~~~~~");
		
		System.out.println("학년: ");
		System.out.print("점수: " );
		int year = sc.nextInt();
		int score1 = sc.nextInt();
		
		if (year == 4) {
			//60점 이상, 합격
			if (score1 >= 60) {
				System.out.println("합격!");
			} else if (score1 < 60) {
			System.out.println("불합격");
			}
		} else {
			System.out.println("응시 자격에 해당되지 않습니다.");
		}
		
		System.out.println(" ");
		System.out.println("중첩하지 않고 만들기");
		if (year == 4 && score >= 60) {
			System.out.println("합격");
		} else if (year == 4) {
			System.out.println("불합격");
		} else {
			System.out.println("응시 자격에 해당하지 않습니다.");
		}
		sc.close();
		
		
		

	}

}
