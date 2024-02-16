package project07_review;
import java.util.Arrays;

public class lotto { //(int) (Math.random() * 개수) + (시작숫자)
	public static void main(String[] args) {
	double random = Math.random();
	System.out.println(random);
	
	// 1~ 6 사이의 주사위
	int dice = (int) ( Math.random() * 7 + 1) ;
	System.out.println("주사위 값:" + dice);
	
	//1~45사이의 정수
	int lotto =(int) (Math.random()*46 + 1);
	int lotto1 =(int) (Math.random()*46 + 1);
	int lotto2 =(int) (Math.random()*46 + 1);
	int lotto3 =(int) (Math.random()*46 + 1);
	int lotto4 =(int) (Math.random()*46 + 1);
	int lotto5 =(int) (Math.random()*46 + 1);
	System.out.println("로또 번호: " + lotto + " " + lotto1 +" "+ lotto2 + " " +lotto3 +" "+ lotto4+ " " + lotto5);
	
	// 1~20사이의 랜덤수
	int num = (int) (Math.random()*19 +1);
	System.out.println("숫자 뽑기: " + num);
	
	//-20~20
	int num1 = (int) (Math.random()*41 - 20);
	System.out.println("숫자 뽑기2: " + num1);
	
	//1~45사이의 랜덤수 6개를 배열에 중복없이 오름차순으로 저장하시오.
	//과제 중복 제거 및 오름차순 정렬
	int[] num3 = new int[6];
	for (int i = 0; i < num3.length; i++) {
		int lotto6 = (int) (Math.random()*45+1);
		num3[i] = lotto6;
	}
	Arrays.sort(num3);
	for (int i : num3) {
		num3 = Arrays.stream(num3).distinct().toArray();
		System.out.print(i + " " );		
	  
	}
	System.out.println();
	
	
	}
}
