package project11_04_AutoClose;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTxt2 {
	public static void main(String[] args) {
		
		
		//test.txt 파일을 입력할 수 있도록 연결
		// finally 구문에서 close 하지 않아도 자동해제해준다,
		//AutoClosable 인터페이스를 구현한 클래스여야 자동 지원해제
		try(FileInputStream fis = new FileInputStream("text.txt")) {
		
			int read = 0;
			 
			//fis.read(): 지정한 .txt 파일을 한 글자씩 읽어오는 메소드이다.
				//더 이상 읽어올 데이터가 없으면 -1을 반환한다.
			while((read = fis.read()) != -1) { //가져올 글자가 없을 때까지 반복
				System.out.print((char)read);
			}
		} catch (FileNotFoundException e) { //파일이 존재하지 않을 때 발생
			e.printStackTrace(); // 예외가 발생의 원인을 찾아서 단계별로 예외메시지를 출력
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace(); //입력 및 출력 과정에서 발생하는 예외
			System.err.println("입력 및 출력할 게 없습니다.");
		} 
		
		
		/* 수동으로 자원해제하는 코드 찾기
		finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				} //fileifstream에 자료를 해제
			}
		} */
		
	}
}
