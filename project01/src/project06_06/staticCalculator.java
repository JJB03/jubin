package project06_06;

public class staticCalculator  {
	public static void main(String[] args) {
		int arr [ ] = {70, 69, 90, 85, 100};
		System.out.println("abs(-123): "+ calculator.abs(-123)) ;
		System.out.println("max(arr): "+ calculator.max(arr));
		System.out.println("min(arr): "+ calculator.min(arr));
	}
	
	
}
class calculator{
		public static int abs(int val) {
			//절댓값
			return val >= 10 ? val : -val;
		}
		
		//최댓값
		public static int max(int[] arr) {
			int max = Integer.MIN_VALUE;
			for (int i : arr) {
				if(i>max)
					max = i;
			}
			return max;
		}
		public static int min(int[]arr) {
			int min = Integer.MAX_VALUE;
			for (int i : arr) {
				if(i < min)
					min = i;
			}
			return min;
			
	
}


}
