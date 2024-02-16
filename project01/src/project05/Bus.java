package project05;

public class Bus {
	String busName;
	int income;
	int total;
	
	public Bus(String busName) {
		this.busName = busName;
		income = 0;
		total = 0;
	}
	
	public void take(int money) {
		income += money;
		total ++;
	}
	
	public void showBusinfo() {
		System.out.println(busName + "의 수입은 : " +income + "원입니다.");
		System.out.println(busName + "의 수입은 : " +total + "명입니다.");
		System.out.println( );
	}

}
