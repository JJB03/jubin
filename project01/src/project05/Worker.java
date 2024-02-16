package project05;

public class Worker<Subway> {
	String workerName;
	int money;
	
	public Worker(String wokerName) { //초기화
		this.workerName = workerName;
		money = 10000;
	}
	
	public void takeBus(Bus bus) {
		bus.take(2000);
		money -= 2000; 
	}
	
	public void showWorkerInfo() {
		System.out.printf("%s 님의 잔액은 %d원입니다", workerName, money);
		System.out.println( );
	}

}
