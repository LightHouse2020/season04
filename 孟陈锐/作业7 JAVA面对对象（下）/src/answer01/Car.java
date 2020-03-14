package answer01;

public class Car extends Vehicles{
	private int seat;
	public Car(int seat,String brand,String color){
		super(brand,color);
		this.seat=seat;
	}
	
	public void showCar() {
		System.out.println("商标�?"+super.brand);
		System.out.println("颜色�?"+super.color);
		System.out.println("座位�?"+this.seat);
	}
}
