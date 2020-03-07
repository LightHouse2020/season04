package interfaceDemo;

public class InterfaceDemo {
	public static void main(String[] args) {
		Bus bus1=new Bus() {
			
			@Override
			public void start(int station1) {
				// TODO Auto-generated method stub
				
			}
		};
		Bike bike1=new Bike() {
			
			@Override
			public void stop(int station2) {
				// TODO Auto-generated method stub
				
			}
		};
		bike1.start(11);
		bus1.stop(222);
	}
}
