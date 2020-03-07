package Car_Auto;

public class Car extends Car_Auto{
	
	String aircontrolString;
	String CDString;
	public Car(String aircontrolString,String CD) {
		super(4, "yellow", 100, 0);
		this.aircontrolString="OFF";
		this.CDString="OFF";
	}
	
	public void aircontrol_on() {
		this.aircontrolString="ON";
		System.out.println(this.tyre+"轮胎的"+this.colorString+"车"+"空调已打开"+this.aircontrolString);
	}
	public void aircontrol_off() {
		this.aircontrolString="OFF";
		System.out.println(this.tyre+"轮胎的"+this.colorString+"车"+"空调已关闭"+this.aircontrolString);
	}
	
	public void CD_on() {
		this.CDString="ON";
		System.out.println("CD已打开"+this.CDString);
	}
	public void CD_off() {
		this.CDString="OFF";
		System.out.println("CD已关闭"+this.CDString);
	}
	
	public void speed_up(float speed_up) {
		System.out.println("新型小汽车加速快！");
		this.speed=2*speed_up;
		System.out.println(this.tyre+"轮胎的"+this.colorString+"车"+"加速后速度为："+this.speed);
	}
	
	public void speed_down() {
		System.out.println(this.tyre+"轮胎的"+this.colorString+"车"+"新型小汽车速度太快刹不住车! GG! ");
	}
	
	public void stop() {
		
	}
	
	public static void main(String[] args) {
		Car_Auto auto1=new Car_Auto(8,"white", 100, 0);
		Car car1=new Car(null, null);
		auto1.speedup(33);
		auto1.speeddown(10);
		auto1.stop();
		
		car1.aircontrol_on();
		car1.aircontrol_off();
		car1.speed_up(100);
		car1.speed_down();
		
	}
}
