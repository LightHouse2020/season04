package car.auto;

public class Car extends CarAuto{
	
	String aircontrolString;
	String CDString;
	public Car(String aircontrolString,String CD) {
		super(4, "yellow", 100, 0);
		this.aircontrolString="OFF";
		this.CDString="OFF";
	}
	
	public void aircontrolOn() {
		this.aircontrolString="ON";
		System.out.println(this.tyre+"杞儙鐨�?"+this.colorString+"杞�"+"绌鸿皟宸叉墦寮�"+this.aircontrolString);
	}
	public void aircontrolOff() {
		this.aircontrolString="OFF";
		System.out.println(this.tyre+"杞儙鐨�?"+this.colorString+"杞�"+"绌鸿皟宸插叧闂�"+this.aircontrolString);
	}
	
	public void cdOn() {
		this.CDString="ON";
		System.out.println("CD宸叉墦寮�?"+this.CDString);
	}
	public void cdOff() {
		this.CDString="OFF";
		System.out.println("CD宸插叧闂�?"+this.CDString);
	}
	
	public void speed_Up(float speed_up) {
		System.out.println("鏂板瀷灏忔苯杞﹀姞閫熷揩锛�");
		this.speed=2*speed_up;
		System.out.println(this.tyre+"杞儙鐨�?"+this.colorString+"杞�"+"鍔犻�熷悗閫熷害涓猴�?"+this.speed);
	}
	
	public void speed_down() {
		System.out.println(this.tyre+"杞儙鐨�?"+this.colorString+"杞�"+"鏂板瀷灏忔苯杞﹂�熷害澶揩鍒�?�笉浣忚�?! GG! ");
	}
	
	public void stop() {
		
	}
	
	public static void main(String[] args) {
		CarAuto auto1=new CarAuto(8,"white", 100, 0);
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
