
//题目3：利用递归方法求50!

public class program3 {
	public static void main(String[] args) {
		System.out.println(factorial(50));
	}
	public static double factorial(int n) {
		if(n==0||n==1) {
			return 1d;
		}
		return n*factorial(n-1);
	}
}
