package project06;
import java.util.Scanner;

class Book{
	String title, author;

	public Book() {
		super();
	}
	//선언
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
}

//-------------------------------------------------//

public class arraylist {
public static void main(String[] args) {
	Book[] bookArray = new Book[3];
	
	Scanner sc= new Scanner(System.in);
	
	//사용자 입력
	for (int i = 0; i < bookArray.length; i++) {
		System.out.println("제목: ");
		String title = sc.nextLine();
		System.out.println("저자: ");
		String author = sc.nextLine();
		// book 객체 생성해 bookarray에 대입
		bookArray[i] = new Book (title, author);
	}
	//출력
	for (Book book : bookArray) {
		System.out.println(book);
		//패키지 클래스명 @해시코드 ->  오버라이딩으로 문자열의 형태로 바뀜
	}
	
	sc.close();
}
}
