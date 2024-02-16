package project08_1;
// 인터페이스를 구현: (1)implements 
public class RcCar implements RemoteControl{

	int speed;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원이 켜집니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원이 꺼집니다.");
	}

	@Override
	public void setSpeed(int speed) {
		// 최대, 최소 넘지 못하게 지정
		if(speed>RemoteControl.Max_Speed) this.speed = RemoteControl.Max_Speed;
		else if(speed<RemoteControl.Min_Speed) this.speed= RemoteControl.Min_Speed;
		
		System.out.println("현재 스피드: "+this.speed);
	}
	
	

}
