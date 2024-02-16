package project11_02_Up_Down;

public class Person {
	
	String name;
	int age;
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드
	public String work() {
		return "일을 합니다." ;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
