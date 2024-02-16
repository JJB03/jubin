package project_book;

import java.util.Iterator;
import java.util.Scanner;

public class txt_08_triangle {

	public static void main(String[] args) {
		int a = 7;
		int check = 0;
		
		for (int i = 0; i < a; i++) {
			if (i%2 == 1 ) {
				check += 1;
			}
		}
		
		int check2 = 3;
		int star = 1;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < check2; j++) {
				//공백
			System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				//별
				System.out.print("*"); 
			}
			check2 -= 1;
			star += 2;
			System.out.println( );
		}
		   
		}

	}

