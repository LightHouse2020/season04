import com.sun.java_cup.internal.runtime.virtual_parse_stack;
import com.sun.org.apache.bcel.internal.generic.LoadClass;

public class Truck extends Vehicles{
	float load;
	public Truck(float load){
		super("BMW","Black");
		this.load=load;
	}
	
	public void showTruck() {
		System.out.println("商标："+this.brand);
		System.out.println("颜色："+this.color);
		System.out.println("载重："+this.load);
	}
	
	public static void main(String[] args) {
		Vehicles v1=new Vehicles(null, null);
		Car c1=new Car(6);
		Truck T1=new Truck(1000);
		v1.run();
		v1.showInfo();
		c1.showCar();
		c1.run();
		T1.showTruck();
	}
}
