package answer01;

public class Vehicles {

	protected String brand;
	protected String color;
	public Vehicles(String brand,String color) {
		this.brand = brand;
		this.color = color;
	}
	
	public void run() {
		System.out.println("我已经在�?动了");
	}
	
	public void showInfo() {
		System.out.println("商标�?"+this.brand+" 颜色:"+this.color);
	}


}
