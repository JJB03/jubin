package project06_05;

public class staticmember {
	//static 변수
	static int a;
	static int b;
	int c;
	static final double PI = 3.141592;
	
	public static int sum (int x, int y) { 
		int sum = a+b+x+y;
		//sum += c; static이 아니기에 불가능하다
		return sum;
		
	}
	public static void main(String[] args) {
	// static 메소드는 객체 생성 없이 호출이 가능하다.
		int sum = sum (10,20);
	a = 100;
	staticmember s1 = new staticmember();
	staticmember s2 = new staticmember();
	
	int a1 = s1.a;
	int c1 = s1.c = 10;
	int a2 = s2.a;
	int c2 = s2.c = 20;
	
	//PI = 100; final로 변할 수 없다.
	
	System.out.println("a1: " + a1);  //?
	System.out.println("c1: " + c1); //?
	System.out.println("a2: " + a2); //? 
	System.out.println("c2: " + c2); //?
	}

}
