
public class Car extends Vehicles{
	int seat;
	public Car(int seat){
		super("Benz","white");
		this.seat=seat;
	}
	
	public void showCar() {
		System.out.println("商标："+this.brand);
		System.out.println("颜色："+this.color);
		System.out.println("座位："+this.seat);
	}
}
