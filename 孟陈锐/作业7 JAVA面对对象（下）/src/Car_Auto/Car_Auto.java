package Car_Auto;

public class Car_Auto {
	int tyre;
	String colorString;
	float weight;
	float speed;
	public Car_Auto(int tyre,String colorString,float weight,float speed) {
		// TODO Auto-generated constructor stub
		this.speed=speed;
		this.colorString=colorString;
		this.weight=weight;
		this.speed=speed;
	}
	
	public void speedup(float speed_up) {
		this.speed+=speed_up;
		System.out.println(this.tyre+"轮胎的"+this.colorString+"车"+"加速后的速度为"+speed);
		
	}
	public void speeddown(float speed_down) {
		this.speed-=speed_down;
		System.out.println(this.tyre+"轮胎的"+this.colorString+"车"+"加速后的速度为"+speed);
		
	}
	public void stop() {
		this.speed=0;
		System.out.println(this.tyre+"轮胎的"+this.colorString+"车"+"停止后的速度为"+speed);
		
	}
}	
