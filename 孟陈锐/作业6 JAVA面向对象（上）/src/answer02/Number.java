package answer02;

//模拟计算�?

public class Number {
	private int n1;
	private int n2;
	
	public Number(int n1,int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public int addition(int n1,int n2) {
		int result;
		result = n1+n2;
		return result;
	}
	
	public int subtration(int n1,int n2) {
		int result;
		result = n1-n2;
		return result;
	}
	
	public int multiplication(int n1,int n2) {
		int result;
		result = n1*n2;
		return result;
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
