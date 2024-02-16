package project11_01_try_Catch;


class Animal{ //부모		
} 

class Dog extends Animal{ //자식
	// 다시 animal을 dog로 다운캐스팅 할 수 없다.
}

class Cat extends Animal{ //자식
	// cat을 dog로 타입 변환할 수 없다.
}
public class ClassCast {
/*예외처리
 * ClassCastException : 클래스 간의 타입 변환시 올바르지 않은 변환으로 발생하는 예외
 * 		Upcasting이 전제되지 않은 Downcasting 을 하는 경우
 * 		부모-자식의 관계가 아닌 클래스로 캐스팅하는 경우
 */
	
	public static void main(String[] args) {
		//예외 메시지 : ClassCastException
		Dog dog = new Dog();
		changToDog(dog); //가능
		Cat cat = new Cat();
		changToDog(cat); //? 
	}
	
	
	public static void changToDog (Animal animal) { //매개변수로 받는 과정에서 업캐스팅
		try {
			Dog dog = (Dog) animal;
		} catch (Exception e) {
			System.err.println("cat을 dog로 호출 불가");
		}
		
		
	}
	
}
