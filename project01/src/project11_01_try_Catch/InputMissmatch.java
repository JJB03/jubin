package project11_01_try_Catch;
import java.util.Scanner;

/*예외처리
 * InputMismatchException : 입력 시, 자료형이 입력 메소드와 일치하지 않을 경우의 상황
 	ㄴ nextInt가 문자형을 받는 경우*/
public class InputMissmatch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int menuno = 0;
		String MenuName = "";
		
		do {
		System.out.println("1, Java ");
		System.out.println("2, Oracle DB");
		System.out.println("3, Html ");
		System.out.println("4, Css");
		System.out.println("5, Javascript");
		System.out.println("0, 종료");
		System.out.print("입력: ");

		try { //숫자를 입력하지 않고 문자를 입력한 경우
			menuno = sc.nextInt();
		} catch (Exception e) {
			sc.next();//입력스트림에 남아있는 엔터를 제거
			System.err.println("(0~5) 사이의 번호를 입력해주세요.");
			continue;
		}
		
		//종료조건
		if(menuno == 0) break;
		
		switch(menuno) {
		case 1: MenuName = "Java"; break;
		case 2: MenuName = "Oracle DB"; break;
		case 3: MenuName = "HTML"; break;
		case 4: MenuName = "CSS"; break;
		case 5: MenuName = "JavaScript"; break;
		}
		
		} while (true);
		
	sc.close();	
	}
	
}
