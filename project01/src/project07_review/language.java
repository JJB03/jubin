package project07_review;

public class language {
//배열 
	// 1 2 3 4 5 와 java sql html css jsp dart를 사용하시오
	public static void main(String[] args) {
		int count[] = new int [6];
		for (int i = 0; i < count.length; i++) {
			count[i] = (i+1);
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i]+ " ");
		}System.out.println();
		
		String language[]= { "java", "sql", "html", "css", "jsp", "dart"};
		
		for (int i = 0; i < language.length; i++) {
			System.out.print(language[i]+" ");
		}
		System.out.println();
		
		for (String lang : language) {
			System.out.print(lang +" ");
		}
		System.out.println();
		}
}
