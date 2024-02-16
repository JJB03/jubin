package project08;
import java.util.Scanner;

//실행
public class ShapeMaker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = 0.0;
		double h = 0.0;
		double r = 0.0;
		
		//입력 받은 도형 배열
		Shape[] ShapeList = new Shape[3];
		int index = 0;
		
		while(true) {
			if(index > 2) break;
			
			System.out.println("(1)삼각형 (2)사각형 (3)원형: ");
			String input = sc.next();	//next 반환다음 String 
			
			if(input.equals("그만") )
				break;
			
			//도형 선택
			switch (input) {
			case "1":
				System.out.println("-------------");
				System.out.print("가로: ");
					w = sc.nextDouble();
				System.out.print("세로: ");
					h = sc.nextDouble();
					
			ShapeList[index++] =new Triangle(w,h); //가져오기
						break;
				
			case "2":
				System.out.println("-------------");
				System.out.print("가로: ");
				w = sc.nextDouble();
				System.out.print("세로: ");
				h = sc.nextDouble();			
				
			ShapeList[index++] =new Rectangle(w,h); //가져오기
						break;
						
			case "3":
				System.out.println("-------------");
				System.out.print("반지름: ");
				r = sc.nextDouble();
			
			ShapeList[index++] =new Circle(r); //가져오기
						break;
						
			default: System.out.println("~~없음~~");
				break;
			} //sw
		} //wh
		
		
		//넓이 구하기 위한 합계 변수 선언
		//넓이 총합, 둘레 총합
		double areaSum = 0.0;
		double roundSum = 0.0;
		
		for (Shape shape : ShapeList) {
			if (shape == null) //비어있는 지 확인
				continue;
			
			//인스턴스를 비교하는 연산, 같은 인스턴스면 true 아니면 false를 반환한다.
			if(shape instanceof Triangle)
				System.out.println("삼각형");
			if(shape instanceof Rectangle)
				System.out.println("사각형");
			if(shape instanceof Circle)
				System.out.println("원형");
			
			//넓이 둘레
			double area = shape.area();
			double round = shape.round();
			
			//합계
			areaSum += area;
			roundSum += round;
			System.out.print("넓이: " + area + "\t");
			System.out.print("둘레: " + round + "\t");
			System.out.println();
		} // foreach끝
		System.out.println(" 넓이 총합: " + areaSum );
		System.out.println(" 둘레 총합: " + roundSum );
		sc.close();
	}

}
