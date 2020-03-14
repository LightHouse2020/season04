package answer01;
import java.util.Scanner;

//01_交通工具(Vehicle)的类
//设置初始速度方法，加速方法，减速方法

public class Vehicle {
	private int speed;
	private float size;
	
	public Vehicle(int speed,float size) {
		this.speed = speed;
		this.size = size;
	}
	
	public void setSpeed(int speed_set) {
		this.speed = speed_set;
	}
	
	public void speedUp(int up) {
		this.speed+=up;
	}

	public void speedDown(int down) {
		this.speed-=down;
	}
	
	public static void main(String [] args) {
		Vehicle carVehicle=new Vehicle(100,200);
		System.out.println("现在的速度："+carVehicle.speed);
		System.out.println("大小："+carVehicle.size);
		carVehicle.setSpeed(120);
		System.out.println("现在的速度："+carVehicle.speed);
		System.out.println("加速20：");
		carVehicle.speedUp(20);
		System.out.println("现在的速度："+carVehicle.speed);
		System.out.println("减速100：");
		carVehicle.speedDown(100);
		System.out.println("现在的速度："+carVehicle.speed);
	}
}
