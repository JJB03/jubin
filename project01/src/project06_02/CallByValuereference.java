package project06_02;
import project05_2.Car;

public class CallByValuereference {
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		Car car = new Car();
		
		//arr []= [1][2][3] ..
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1);
		}
		System.out.println("main-------------");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(car);
		
		//래퍼런스에 인한 호출: CallByValueReference
		setArr(arr);
		setObject(car);

		System.out.println("---------set() 호출 후");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println(car);
	}

	
	private static void setArr(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) *10; // 10 20 30 40 50
		}
		System.out.println("setArr메소드---------------------");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	private static void setObject(Car car) {
		// TODO Auto-generated method stub
		car.setSpeed = 200;
		car.setModel("볼보");
	}

	@Override
	public String toString() {
		return "CallByValuereference []";
	}

}
