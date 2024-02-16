package project08;

public class SingletonTest {

	public static void main(String[] args) {
		singleTon so1 = singleTon.getInstance();
		singleTon so2 = singleTon.getInstance();
		
		//동일한 인스턴스인지 확인 
		System.out.print("s01 과 s02가 같은지 여부: ");
		System.out.print(so1 == so2);
	}

}
