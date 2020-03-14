package answer01;

public class Truck extends Vehicles{
	private float load;
	public Truck(float load){
		super("BMW","Black");
		this.load=load;
	}
	
	public void showTruck() {
		System.out.println("商标�?"+this.brand);
		System.out.println("颜色�?"+this.color);
		System.out.println("载重�?"+this.load);
	}
	
	public static void main(String[] args) {
		Vehicles c1=new Car(6,"奔驰","黑色");
		c1.run();
		c1.showInfo();
		
		Vehicles truck=new Truck(6);
	}
}
