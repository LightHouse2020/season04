package car.auto;

public class CarAuto {
	int tyre;
	String color;
	float weight;
	float speed;
	public CarAuto() {
	}
	public CarAuto(int tyre,float weight,float speed) {
		this.speed=speed;
		this.weight=weight;
		this.speed=speed;
	}
	public CarAuto(int tyre,String colorString,float weight,float speed) {
		this.speed=speed;
		this.color=colorString;
		this.weight=weight;
		this.speed=speed;
	}
	
	public void speedUp(float speed_up) {
		this.speed+=speed_up;
		System.out.println(this.tyre+"轮胎�?"+this.colorString+"�?"+"加�?�后的�?�度�?"+speed);
		
	}
	public void speedDown(float speed_down) {
		this.speed-=speed_down;
		System.out.println(this.tyre+"轮胎�?"+this.colorString+"�?"+"加�?�后的�?�度�?"+speed);
		
	}
	public void stop() {
		this.speed=0;
		System.out.println(this.tyre+"轮胎�?"+this.colorString+"�?"+"停止后的速度�?"+speed);
		
	}
}	
