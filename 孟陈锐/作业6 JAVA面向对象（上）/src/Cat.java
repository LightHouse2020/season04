
//继承：这是一个子类,子类继承父类的该数据成员 通过构造函数初始化并显示该数据成员的值。

public class Cat extends Animal{
	public Cat() {
	}
	
	public Cat(String name,int age) {
		//super("xixi",100);
	}
	
	public static void main(String[] args) {
		Cat miCat=new Cat();
		System.out.println("继承父类（Animal）的数据:"+miCat.age);
	}
}
