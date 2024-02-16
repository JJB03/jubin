package project11_03_MultiCatch;

import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		//발생가능 할 수 있는 예외
		//1) AirthmeticException
		//2) NumberFormatException
		//3)ClassCastException
		//4)IndexOutOfBoundException
		//5)InputMismatchException
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 자리 수인 정수 2개를 입력하라 ");
		System.out.println("ㄴ");
		try {
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			
			char[] char1 = str1.toCharArray(); //string -> char[]로 변환
			char[] char2 = str2.toCharArray(); // "10" -> [1][0]
			
			String[] input1 = new String[char1.length];
			String[] input2 = new String[char2.length];
		//char1->['1']['0']
			//input1 -> ["1"]["0"]
			
			for (int i = 0; i < input2.length; i++) {
				input1[i] = char1[i] + " ";
			}
			for (int i = 0; i < input2.length; i++) {
				input2[i] = char1[i] + " ";
			}
			
			System.out.println(input1[0]+input1[1]);
			System.out.println(input2[0]+input2[1]);
			
			int value1 = Integer.parseInt(str1);
			int value2 = Integer.parseInt(str2);
			int result = value1 + value2;
			System.out.println(str1 + "+" + str2 + "=" + result);
			
			//멀티 catch
			//: 하나의 catch 블록에서 처리하고 싶은 예외를 | 기호로 연결하여 묶어서 처리하는 것
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.err.println(" 숫자로 변환 할 수 없는 값입니다. ");
			System.err.println("접근할 수 없는 배열 index입니다. ");
		}  catch (Exception e) {
			System.err.println("알 수 없는 예외 발생");
		}
		
		sc.close();

	}

}
