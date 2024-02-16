package project05;

public class Main {

	public static void main(String[] args) {
		Worker a = new Worker("A");
		Worker b = new Worker("B");
		
		Bus no3000 = new Bus("3000");
		Bus no81 = new Bus("81");
		
		a.takeBus(no3000);
		b.takeBus(no3000);
		
		a.showWorkerInfo();
		b.showWorkerInfo();
		
		no3000.showBusinfo();
		no81.showBusinfo();

	}

}
