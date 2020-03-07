package interfaceDemo;

public interface Bus extends Vehicle{
	public default void stop(int station2) {
		System.out.println("停了:"+station2);
	}
}
