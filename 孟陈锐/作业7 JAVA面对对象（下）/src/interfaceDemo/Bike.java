package interfaceDemo;

public interface Bike extends Vehicle{
	public default void start(int station1) {
		System.out.println("出发了:"+station1);
	}
}
