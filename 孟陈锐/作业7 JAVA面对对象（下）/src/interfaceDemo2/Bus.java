package interfaceDemo2;

public class Bus implements Vehicle{
	@Override
	public void start(int station1) {
		System.out.println("汽车开始："+station1);
	}

	@Override
	public void stop(int station2) {
		System.out.println("汽车终止："+station2);
	}
}
