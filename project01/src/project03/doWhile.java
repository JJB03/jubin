package project03;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		
		// do{ 무조건 1번은 실행
		// 반복 실행문;
		// } while(조건식);
		
		// 메뉴판, 변수 선언: 메뉴번호, 메뉴이름 
		Scanner sc= new Scanner(System.in);
		int Menunum;
		String Menuname= "";

		
		do {
			System.out.println("1) 마라탕: 10000");
			System.out.println("2) 김밥: 5000");
			System.out.println("3) 돈가스: 25000");
			System.out.println("4) 쌀국수: 4500");
			System.out.println("5) 기타");
			System.out.print("메뉴: ");
			Menunum = sc.nextInt();
			
			if (Menunum == 6) break;
			
			switch (Menunum) {
			case 1: Menuname = "마라탕"; break;
			case 2: Menuname = "김밥"; break;
			case 3: Menuname = "돈가스"; break;
			case 4: Menuname = "쌀국수"; break;
			case 5: Menuname = "기타"; break;
			
			default: Menuname = "다른 것"; break;
			}
			// 유효성 검사
			if (Menunum != 6) {
				System.out.println(Menuname + "을/를 먹었습니다.");
			}	
				else {
					System.out.println("1~5번까지의 숫자만 입력해주세요.");
					System.out.println("종료시키려면 6번을 눌러주세요.");
				}
		} while (Menunum != 6  );
	
		System.out.println("메뉴판을 종료합니다.");
			sc.close();
	}
				

}
