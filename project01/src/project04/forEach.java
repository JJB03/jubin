package project04;
import java.util.Iterator;

public class forEach {

	public static void main(String[] args) {
	//for (자료형 반복요소: 배열 or 컬렉션){
	// 		반복실행문;
	//	}
		//배열 선언 및 초기화
		String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		// foreach" ctrl + space
		for (String day : week) {
			System.out.print(day+" "); //day: arr[i]
		}
		
	/*	for (int i = 0; i < week.length; i++) {
			System.out.println(week[i]+ " ");
			
		}  
		기본 for문: 증감식이나 조건을 마음대로, foreach문: 무조건 처음부터 끝까지 반복 */
	}

}
