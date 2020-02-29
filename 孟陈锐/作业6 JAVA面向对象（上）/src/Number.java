
//模拟计算器

public class Number {
	private int n1,n2;
	
	public Number(int n1,int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public int addition(int n1,int n2) {
		int add;
		add = n1+n2;
		return add;
	}
	
	public int subtration(int n1,int n2) {
		int sub;
		sub = n1-n2;
		return sub;
	}
	
	public int multiplication(int n1,int n2) {
		int mul;
		mul = n1*n2;
		return mul;
	}
	
	public float division(int n1,int n2) {
		float div;
		div = (float)n1/n2;
		return div;
	}
	
	public static void main(String [] args) {
		Number number1=new Number(12, 13);
		System.out.println("12+13="+number1.addition(12, 13));
		System.out.println("12-13="+number1.subtration(12, 13));
		System.out.println("12*13="+number1.multiplication(12, 13));
		System.out.println("12/13="+number1.division(12, 13));
	}
}
